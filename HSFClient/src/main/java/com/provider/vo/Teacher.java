package com.provider.vo;

import com.provider.dto.Student;

/**
 * Created by huangJin on 2023/5/19.
 */
public class Teacher {
    private String name;
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
