package com.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Classname User
 * @Description Person
 * @Date 2021/8/31 14:00
 * @Created by huangwencai
 */

@Data
public class Person {
    private int id;
    private String user_name;
    private int age;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctm;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime ruzhi_time;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lizhi_time;
}
