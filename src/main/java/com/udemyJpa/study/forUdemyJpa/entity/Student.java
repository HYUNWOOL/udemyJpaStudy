package com.udemyJpa.study.forUdemyJpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="fname")
    private String firstName;
    @Column(name="lname")
    private String lastName;
    private Long score;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + lastName +" "+ firstName + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}