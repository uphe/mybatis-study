package com.hzy.pojo;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String studentName;
    private Teacher teacher;
}
