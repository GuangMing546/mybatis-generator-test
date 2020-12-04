package com.gm.mybatisTest.Service.impl;

import com.gm.mybatisTest.Service.StudentService;
import com.gm.mybatisTest.entity.Student;
import com.gm.mybatisTest.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;
    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
