package com.demo;

import com.demo.dao.StudentsDao;
import com.demo.entity.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class text {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-*.xml");
        StudentsDao sd=(StudentsDao)ac.getBean("StudentsDao");
        Students ss=sd.queryById(11);
        System.out.println(ss);
    }
}
