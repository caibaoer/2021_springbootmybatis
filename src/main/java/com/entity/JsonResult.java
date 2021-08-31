package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname JsonResult
 * @Description TODO
 * @Date 2021/8/31 14:08
 * @Created by huangwencai
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult {
    private String status = null;
    private Object result = null;
}
