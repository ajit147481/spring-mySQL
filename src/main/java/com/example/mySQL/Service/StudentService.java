package com.example.mySQL.Service;

import com.example.mySQL.Model.Student;
import com.example.mySQL.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}
