package com.udemyJpa.study.forUdemyJpa.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="employee")
public class Employee {

//    @TableGenerator(name="employee_gen", table = "id_gen",pkColumnName = "gen_name",valueColumnName = "gen_val",allocationSize = 100)
    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE,generator = "employee_gen")
    @GenericGenerator(name="emp_id",strategy = "com.udemyJpa.study.forUdemyJpa.customeId")
    @GeneratedValue(generator = "emp_id")
    private Long id;
    private String name;
}
