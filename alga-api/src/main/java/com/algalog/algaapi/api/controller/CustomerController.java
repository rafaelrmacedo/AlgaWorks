package com.algalog.algaapi.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import com.algalog.algaapi.domain.model.Customer;

@RestController
public class CustomerController {
    @GetMapping("/Customers")
    public List<Customer> List() {
        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setCname("Rafael");
        customer1.setEmail("rafaelmacedo@gmail.com");
        customer1.setCellphoneNumber("99999-0000");

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setCname("John");
        customer2.setEmail("john@gmail.com");
        customer2.setCellphoneNumber("99999-1111");

        return Arrays.asList(customer1, customer2);
    }
}
