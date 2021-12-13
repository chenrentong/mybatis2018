package com.atguigu.mybatis.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

/**
 * @author chenrentong
 * @create 2021-12-13 18:04
 */
@Getter
@Setter
@ToString
//@Alias("emp")
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;

}
