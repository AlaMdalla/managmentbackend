package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "myproduct")
public class MyProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private  String name;
        private int codeISBN;
    private Date dateEntree;
    private int aneeEdition;
    private  String matiere;
    private  String institution;
    private  String Niveau;
    private  boolean PreviousYear;
    private  boolean nextyear;

    private  String img;
}
