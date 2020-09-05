package com.biz.student.exec;

import java.util.Scanner;

import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV1;

public class StudentExec_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String fileName = "src/com/biz/student/student.txt";
		String[] item = new String[] {"학번", "이름", "학과", "학년", "번호"}; 
	
		StudentService sService = new StudentServiceImplV1(scan, fileName, item);

		Boolean ret = true;
		
		while(ret) {
			ret = sService.numInput()
					&& sService.nameInput()
					&& sService.deptInput()
					&& sService.gradeInput()
					&& sService.telInput();			
		}
		
		
		sService.saveList();
		sService.printList();
	}
}
