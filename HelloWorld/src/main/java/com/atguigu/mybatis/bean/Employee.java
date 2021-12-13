package com.atguigu.mybatis.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author chenrentong
 * @create 2021-12-13 18:04
 */
@Getter
@Setter
@ToString
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;

}
