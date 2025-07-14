package com.secureapi.projectone.admin;

import com.secureapi.projectone.customer.Customer;
import com.secureapi.projectone.customer.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/")
    public String healthCheck() {
        return "Admin is up";
    }
}