package com.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Classname User
 * @Description TODO
 * @Date 2021/8/31 14:00
 * @Created by huangwencai
 */
@Data
public class User {
    private int id;
    private String username;
    private int age;
    private Date ctm;
}
