package com.py.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author pangy
 * @version 1.0
 * @date 2020/4/21 23:29
 */
@RestController
public class TestControl {

    @Autowired
    public DataSource dataSource;

    @GetMapping("hello")
    public String getTestDate(){
        return "Hello,world";
    }
}
