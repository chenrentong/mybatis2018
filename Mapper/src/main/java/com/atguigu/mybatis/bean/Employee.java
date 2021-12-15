package com.atguigu.mybatis.bean;


import lombok.*;

/**
 * @author chenrentong
 * @create 2021-12-13 18:04
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
//@Alias("emp")
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;
    private Department dept;

}
