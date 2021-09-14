package com.controller;

import com.entity.JsonResult;
import com.entity.Person;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname PersonController
 * @Description PersonController
 * @Date 2021/9/14 13:45
 * @Created by huangwencai
 */
@RestController
public class PersonController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "person/{id}", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getPersonById (@PathVariable(value = "id") Integer id){
        JsonResult r = new JsonResult();
        try {
            Person person = userService.getPersonById(id);
            r.setResult(person);
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }
}
