package com.biz.student.service;

public interface StudentService {

	// 학생정보 불러오기
	public void loadList();
	
	// 사용자 입력 (학번, 이름, 학과, 학년, 전화번호) method
	public boolean numInput();
	public boolean nameInput();
	public boolean deptInput();
	public boolean gradeInput();
	public boolean telInput();
	
	// 입력양식 method
	public String inputForm(String item);
	
	// 학번생성 method
	public String stNumGen();
	
	// 등록된 학번인지 확인하는 method
	public boolean certId();
	
	// 입력된 학생정보 저장하기
	public void saveList();
	
	// 저장된 정보 출력하기
	public void printList();
}
