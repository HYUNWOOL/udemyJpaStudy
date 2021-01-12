package com.udemyJpa.study.forUdemyJpa.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class CreditCard extends Payment{

    private String cardNumber;

}