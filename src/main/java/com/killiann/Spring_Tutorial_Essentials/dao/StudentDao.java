package com.killiann.Spring_Tutorial_Essentials.dao;

import com.killiann.Spring_Tutorial_Essentials.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {

    //Define what queries we will do from the database
    int insertNewStudent(UUID studentId, Student student);

    Student selectStudentById(UUID studentId);

    List<Student> selectAllStudents();

    int updateStudentById(UUID studentId, Student studentUpdate);

    int deleteStudentById(UUID studentId);
}
