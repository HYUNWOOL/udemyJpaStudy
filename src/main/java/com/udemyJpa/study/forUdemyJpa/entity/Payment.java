package com.udemyJpa.study.forUdemyJpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment {

    @Id
    private Long id;
    private double amount;


    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount='" + amount+
                '}';
    }
}