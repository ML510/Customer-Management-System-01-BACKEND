package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.custom.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService service;

    @PostMapping("/add") //http://localhost:8080/customer/add
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

}
