package com.example.service;

import java.util.List;

import com.example.model.StudentModel;

public interface StudentService
{
    StudentModel selectStudent (String npm);


    List<StudentModel> selectAllStudents ();


    boolean addStudent (StudentModel student);


    boolean deleteStudent (String npm);

    boolean updateStudent(String npm, String name, double gpa);
}
