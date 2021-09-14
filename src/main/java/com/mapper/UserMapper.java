package com.mapper;

import com.entity.Person;
import com.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2021/8/31 14:01
 * @Created by huangwencai
 */

/**
 * @Mapper这个注解可以不写，如果写了，那么在启动类上面的@MapperScan("com.mapper")就可以不要了，测试下呢？---->  是真的，记住了。
 * 如果没有写@Mapper,那么在启动类上添加@MapperScan("com.mapper")就可以了，测试下呢？  是真的，记住了。
 */
//@Mapper
//@Mapper
public interface UserMapper {
    @Select("SELECT * FROM tb_user WHERE id = #{id}")
    User getUserById(Integer id);

    @Select("SELECT * FROM tb_user")
    public List<User> getUserList();

    @Insert("insert into tb_user(username, age, ctm) values(#{username}, #{age}, now())")
    public int add(User user);

    @Update("UPDATE tb_user SET username = #{user.username} , age = #{user.age} WHERE id = #{id}")
    public int update(@Param("id") Integer id, @Param("user") User user);

    //@Delete("DELETE from tb_user where id = #{id} ")
    public int delete(Integer id);


    @Select("SELECT * FROM tb_person WHERE id = #{id}")
    Person getPersonById(Integer id);
}
