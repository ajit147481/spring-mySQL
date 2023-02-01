package com.example.mySQL.Service;

import com.example.mySQL.Enums.CardStatus;
import com.example.mySQL.Model.Card;
import com.example.mySQL.Model.Student;
import com.example.mySQL.Repository.CardRepository;
import com.example.mySQL.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CardRepository cardRepository;
    public void addStudent(Student student) {

        studentRepository.save(student);
    }

    public void setCard(int id) {
        Student student=studentRepository.findById(id).get();
        Card card=new Card();
        card.setStudent(student);
        card.setCardStatus(CardStatus.Activated);
        student.setCard(card);
        cardRepository.save(card);
    }
}
