package com.atguigu.mybatis.bean;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	
	private Integer id;
	private String departmentName;
	private List<Employee> emps;

}
