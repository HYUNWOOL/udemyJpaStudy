package com.udemyJpa.study.forUdemyJpa;

import com.udemyJpa.study.forUdemyJpa.entity.Employee;
import com.udemyJpa.study.forUdemyJpa.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ForUdemyJpaApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void saveEmployee(){
        Employee employee = new Employee();
        employee.setName("lee1");

        employeeRepository.save(employee);

    }
}
