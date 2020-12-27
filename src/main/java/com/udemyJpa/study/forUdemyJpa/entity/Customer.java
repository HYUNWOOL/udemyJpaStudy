package com.udemyJpa.study.forUdemyJpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="customer")
public class Customer {

    @Id
    private long id;
    private String name;
    private String email;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + email + '\'' +
                '}';
    }
}