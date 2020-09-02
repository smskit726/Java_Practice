package com.biz.student.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentVO {

	private String stNum;
	private String stName;
	private String stDept;
	private int stGrade;
	private String stTel;
	
}
