package com.biz.student.exec;

import com.biz.student.service.LineService;
import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV1;

public class StudentExec_01 {
	public static void main(String[] args) {

		StudentService sService = new StudentServiceImplV1();

		sService.loadList();
		sService.numInput();
		sService.nameInput();
		sService.deptInput();
		sService.gradeInput();
		sService.telInput();
		sService.saveList();
		sService.printList();
		
	}
}
