package com.example.mySQL.Controller;

import com.example.mySQL.Model.Student;
import com.example.mySQL.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add_student")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("student added Successfully", HttpStatus.OK);
    }
    @PostMapping("/set_card")
    public ResponseEntity<String> set_card(@RequestParam("id") int id){
        studentService.setCard(id);
        return new ResponseEntity<>("card is activated",HttpStatus.OK);
    }
}
