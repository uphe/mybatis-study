package com.hzy.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private Integer id;
    private String teacherName;
    private List<Student> studentList;
}
