package com.demo.dao;

import com.demo.entity.Students;

import java.util.List;

public interface StudentsDao {
//    public List selectall();
    public Students queryById(int id);
}
