package com.gm.mybatisTest.controller;

import com.gm.mybatisTest.Service.impl.StudentServiceImpl;
import com.gm.mybatisTest.Service.impl.TeacherServiceImpl;
import com.gm.mybatisTest.entity.Student;
import com.gm.mybatisTest.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGenerator {

    @Autowired
    StudentServiceImpl studentService;

    @Autowired
    TeacherServiceImpl teacherService;

    @GetMapping("/getStu")
    public Student getStudent(){
        return studentService.getStudentById(1);
    }

    @GetMapping("/getTea")
    public Teacher getTeacher(){
        return teacherService.getTeacherById(1);
    }


}
