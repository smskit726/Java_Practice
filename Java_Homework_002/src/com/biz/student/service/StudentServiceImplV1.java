package com.biz.student.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService {

	private List<StudentVO> stdList;
	private StudentVO stdVO;
	private Scanner scan;
	private String fileName;
	private String[] item;
	private String stNum;

	public StudentServiceImplV1() {
		stdList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
		fileName = "src/com/biz/student/student.txt";

		item = new String[] { "학번", "이름", "학과", "학년", "번호" };

		this.loadList();
	}

	@Override
	public void loadList() {
		File file = new File(fileName);
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {

			if (!file.exists()) {
				file.createNewFile();
				return;
			}

			fileReader = new FileReader(this.fileName);
			buffer = new BufferedReader(fileReader);
			String reader = "";

			while (true) {
				reader = buffer.readLine();

				if (reader == null) {
					break;
				}

				String[] student = reader.split(":");
				StudentVO stdVO = new StudentVO();

				stdVO.setStNum(student[SplitPos.ST_NUM]);
				stdVO.setStName(student[SplitPos.ST_NAME]);
				stdVO.setStDept(student[SplitPos.ST_DEPT]);
				stdVO.setStGrade(Integer.valueOf(student[SplitPos.ST_GRADE]));
				stdVO.setStTel(student[SplitPos.ST_TEL]);

				stdList.add(stdVO);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다 :(");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다 :(");
		}
	}

	@Override
	public String inputForm(String item) {
		String temp = "";

		System.out.printf("%s 을(를) 입력하세요. (종료 : END) : ", item);
		temp = scan.nextLine();

		if (temp.equals("END")) {
			System.out.println("이용해주셔서 감사합니다 :)");
			
		} else if (temp.isEmpty()) {
			temp = "Default";
		}

		temp = temp.replaceAll(" ", "");
		return temp;
	}

	@Override
	public boolean numInput() {
		stdVO = new StudentVO();

		while (true) {

			stNum = this.inputForm(item[SplitPos.ST_NUM]);
			
			if(stNum.equals("END")) {
				return false;
			} else if (!this.certId()) {
				System.out.println("이미 등록된 학번입니다. 다시 입력해주세요 :(");
				continue;
			}
			
			int intNum = 0;
			
			try {
				intNum = Integer.valueOf(stNum);
			} catch (NumberFormatException e) {
				System.out.println("학번은 필수 입력사항이며 숫자로만 입력 가능합니다. 학번을 자동생성합니다");
				stNum = this.stNumGen();
			}
			break;
		}

		stdVO.setStNum(stNum);
		return true;
	}

	@Override
	public boolean nameInput() {

		String stName = "";
		while (true) {
			stName = this.inputForm(item[SplitPos.ST_NAME]);

			if(stName.equals("END")) {
				return false;
			} else if (stName.equals("Default")) {
				System.out.println("이름은 필수 입력사항입니다. 다시 입력해주세요");
				continue;
			}
			break;
		}

		stdVO.setStName(stName);
		return true;
	}

	@Override
	public boolean deptInput() {
		String stDept = "";
		
		while(true) {
			stDept = this.inputForm(item[SplitPos.ST_DEPT]);
			
			if(stDept.equals("END")) {
				return false;
			}
			break;
		}
		
		stdVO.setStDept(stDept);
		return true;
	}

	@Override
	public boolean gradeInput() {
		String strGrade = "";
		int intGrade = 0;
		
		while(true) {
			strGrade = this.inputForm(item[SplitPos.ST_GRADE]);
			if(strGrade.equals("END")) {
				return false;
			} else if(strGrade.equals("Default")) {
				System.out.println("입력된 내용이 없어 1학년으로 저장합니다.");
				strGrade = "1";
			}
			
			try {
				intGrade = Integer.valueOf(strGrade);
				
				if(intGrade < 1 || intGrade > 5) {
					System.out.println("학년은 1~5 사이의 값만 입력할 수 있습니다 :( ");
					continue;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("학년은 숫자만 입력가능합니다 :(");
				continue;
			}
			break;
		}
		
		stdVO.setStGrade(intGrade);
		return true;
	}

	@Override
	public boolean telInput() {
		
		String stTel = "";
		
		while(true) {
			stTel = this.inputForm(item[SplitPos.ST_TEL]);
			stTel = stTel.replaceAll("-", "");
			if(stTel.equals("END")) {
				return false;
			} else if(stTel.equals("Default")) {
				System.out.println("입력된 내용이 없어 0으로 저장합니다 :(");
				stTel = "0";
			} else if(stTel.length()>11) {
				System.out.println("전화번호는 11자리이하 입니다 :(");
				continue;
			}
			
			int intTel = 0;
			try {
				intTel = Integer.valueOf(stTel);
			} catch (NumberFormatException e) {
				System.out.println("전화번호에 문자열이 포함되어있습니다. 다시 입력해주세요 :(");
				continue;
			}
			
			break;
		}
		
		stdVO.setStTel(stTel);
		stdList.add(stdVO);
		return true;
	}

	@Override
	public void saveList() {
		FileWriter fileWriter = null;
		PrintWriter pWriter = null;
		
		try {
			fileWriter = new FileWriter(this.fileName, true);
			pWriter = new PrintWriter(fileWriter);
			
			pWriter.printf("%s:", stdVO.getStNum());
			pWriter.printf("%s:", stdVO.getStName());
			pWriter.printf("%s:", stdVO.getStDept());
			pWriter.printf("%d:", stdVO.getStGrade());
			pWriter.printf("%s\n", stdVO.getStTel());
			
			pWriter.flush();
			pWriter.close();
		} catch (IOException e) {
			System.out.println("파일을 저장할 수 없습니다 :(");
		}
	}

	@Override
	public boolean certId() {
		for (StudentVO sVO : stdList) {
			if (stNum.equals(sVO.getStNum())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String stNumGen() {
		
		Calendar calendar = Calendar.getInstance();
		String year = String.valueOf(calendar.get(Calendar.YEAR)); // 학번 앞 4자리 (연도)
		
		stdList.clear();
		this.loadList();
		
		int size = stdList.size();

		String[] seqArr = new String[size];
		String strSeq = "";
		
		if (size==0) {
			strSeq = year + "0001";
			System.out.printf("생성된 학번 : %s\n", strSeq);
			return strSeq;
		}
		
		int i = 0;
		
		for(StudentVO sVO : stdList) {
			seqArr[i] = sVO.getStNum().substring(4);
			i++;
		}
		
		Arrays.sort(seqArr);
		int intSeq = 0;
		try {
			
			for(i = 0; i<size-1; i++) {
				intSeq = Integer.valueOf(seqArr[i]) + 1;
				
				if(intSeq != Integer.valueOf(seqArr[i+1])) {
					strSeq = String.valueOf(intSeq);
					break;
				}
			}
			
			if(i==size-1) {
				intSeq = Integer.valueOf(seqArr[size-1])+1;
				strSeq = String.valueOf(intSeq);
				System.out.println(intSeq);
			}
			
			intSeq = Integer.valueOf(strSeq);
			strSeq = year + String.format("%04d", intSeq);
			System.out.printf("생성된 학번 : %s\n", strSeq);
			
		} catch (NumberFormatException e) {
			System.out.println("학번을 생성할 수 없습니다 :(");
		}
		
		
		
		return strSeq;
	}

	
	public void printList() {
		// stdList를 초기화 하지 않으면 입력되어 있던 내용들이 중복되어 출력!
		stdList.clear();
		// 초기화 후 다시 txt를 읽어 stdList에 담는다.
		this.loadList();
		
		LineService.lineGen("▦", 100);
		System.out.println("학번\t\t이름\t\t학과\t\t학년\t\t전화번호");
		LineService.lineGen("-", 100);
		for(StudentVO sVO : stdList) {
			System.out.printf("%s\t",sVO.getStNum());
			System.out.printf("%s\t\t",sVO.getStName());
			System.out.printf("%s\t\t",sVO.getStDept());
			System.out.printf("%s\t\t",sVO.getStGrade());
			System.out.printf("%s\n",sVO.getStTel());
		}
		LineService.lineGen("▦", 100);
	}
}
