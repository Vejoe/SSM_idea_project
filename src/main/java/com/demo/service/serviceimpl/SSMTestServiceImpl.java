package com.demo.service.serviceimpl;

import com.demo.dao.StudentsDao;
import com.demo.entity.Students;
import com.demo.service.SSMTestService;

import java.util.List;

public class SSMTestServiceImpl implements SSMTestService {
    public StudentsDao SD;
    @Override
    public Students SSMTestServiceprintresult() {
        Students students=SD.queryById(11);
        return students;
    }
}
