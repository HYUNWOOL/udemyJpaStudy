package com.udemyJpa.study.forUdemyJpa;

import com.udemyJpa.study.forUdemyJpa.entity.Customer;
import com.udemyJpa.study.forUdemyJpa.repository.CustomerRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class ForUdemyJpaApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreate() {
        Customer customer = new Customer();
        customer.setId((long) 2);
        customer.setName("name");
        customer.setEmail("a@g.com");

        customerRepository.save(customer);
    }

    @Test
    public void testRead() {
        Optional<Customer> customer = customerRepository.findById((long) 2);
        if (customer.isPresent()) {
            Assert.assertNotNull(customer.get());
            Assert.assertEquals(customer.get().getName(), "name");
            System.out.println("test success");
        }

    }

    @Test
    public void testUpdate() {
        Optional<Customer> customer = customerRepository.findById((long) 2);
        customer.get().setEmail("123@a.c");
        customerRepository.save(customer.get());

    }

    @Test
    public void testDelete() {
        if (customerRepository.existsById((long) 2)) {
            System.out.println("11");
            customerRepository.deleteById((long) 2);
        }
    }

    @Test
    public void testCount() {
        System.out.println("total Record--->>>>>>>>>>>>>>>>" + customerRepository.count());
    }
}
