package com.udemyJpa.study.forUdemyJpa;

import com.udemyJpa.study.forUdemyJpa.entity.Employee;
import com.udemyJpa.study.forUdemyJpa.entity.Product;
import com.udemyJpa.study.forUdemyJpa.repository.EmployeeRepository;
import com.udemyJpa.study.forUdemyJpa.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ForUdemyJpaApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;


    @Autowired
    ProductRepository productRepository;

    @Test
    public void saveEmployee(){
        Employee employee = new Employee();
        employee.setName("lee1");

        employeeRepository.save(employee);

    }


    @Test
    public void findByName(){
        List<Product> productList = productRepository.findByName("apple");
        productList.forEach(p-> System.out.println(p.getPrice()));
        System.out.println("-----------------------------");
    }

    @Test
    public void findByNameByDesc(){
        List<Product> productList = productRepository.findByNameAndDesc("apple","iwatch");
        productList.forEach(p-> System.out.println(p.getPrice()));
        System.out.println("-----------------------------");
    }

    @Test
    public void findByPriceGreaterThan(){
        List<Product> productList = productRepository.findByPriceGreaterThan(400d);
        productList.forEach(p-> System.out.println(p.getPrice()));
        System.out.println("-----------------------------");
    }

    @Test
    public void findByDescContains(){
        List<Product> productList = productRepository.findByDescContains("watch");
        productList.forEach(p-> System.out.println(p.getName()));
        System.out.println("-----------------------------");
    }

    @Test
    public void findByPriceBetween(){
        List<Product> productList = productRepository.findByPriceBetween(500d,1000d);
        productList.forEach(p-> System.out.println(p.getName()));
        System.out.println("-----------------------------");
    }

    @Test
    public void findByDescLike(){
        List<Product> productList = productRepository.findByDescLike("%was%");
        productList.forEach(p-> System.out.println(p.getName()));
        System.out.println("-----------------------------");
    }

    @Test
    public void findByIdIn(){
        List<Product> productList = productRepository.findByIdIn(Arrays.asList((long)1,(long)2,(long)3,(long)4),PageRequest.of(1,2));
        productList.forEach(p-> System.out.println(p.toString()));
        System.out.println("-----------------------------");
    }


    @Test
    public void testFindAll(){
        Page<Product> result = productRepository.findAll(PageRequest.of(3,1));

        result.forEach(p-> System.out.println(p.getName()));
    }

    @Test
    public void testFindAllSorting(){
        productRepository.findAll(Sort.by(Sort.Direction.DESC,"name","price")).forEach(p-> System.out.println(p.getName()));
    }

    @Test
    public void testFindAllPagingAndSorting(){
        productRepository.findAll(PageRequest.of(0,2, Sort.Direction.DESC,"name")).forEach(p-> System.out.println(p.toString()));
    }

}




