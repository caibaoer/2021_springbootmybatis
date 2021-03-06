package com.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Classname User
 * @Description User
 * @Date 2021/8/31 14:00
 * @Created by huangwencai
 */
@Data
public class User {
    private int id;
    private String userName;
    private int age;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctm;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime ruzhi_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lizhi_time;
}
