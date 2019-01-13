package com.killiann.Spring_Tutorial_Essentials.resource;

import com.killiann.Spring_Tutorial_Essentials.model.Student;
import com.killiann.Spring_Tutorial_Essentials.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentResource {

    private final StudentService studentService;

    @Autowired
    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
