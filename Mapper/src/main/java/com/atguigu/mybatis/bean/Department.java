package com.atguigu.mybatis.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Department {
	
	private Integer id;
	private String departmentName;
	private List<Employee> emps;

}
