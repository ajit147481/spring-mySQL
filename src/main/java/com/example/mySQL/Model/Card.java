package com.example.mySQL.Model;

import com.example.mySQL.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn
    private Student student;
    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;

    public Card() {

    }
}
