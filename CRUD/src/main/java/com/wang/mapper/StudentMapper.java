package com.wang.mapper;

import com.wang.pojo.Student;

public interface StudentMapper {

    /**
     * 添加学生
     * @param student
     * @return
     */
    int insertStudent(Student student);
}
