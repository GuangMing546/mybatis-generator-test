package com.gm.mybatisTest.Service.impl;

import com.gm.mybatisTest.Service.TeacherService;
import com.gm.mybatisTest.entity.Teacher;
import com.gm.mybatisTest.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    TeacherMapper teacherMapper;

    @Override
    public Teacher getTeacherById(Integer id) {
        return teacherMapper.selectByPrimaryKey(id);
    }
}
