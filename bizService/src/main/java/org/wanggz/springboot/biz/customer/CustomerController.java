package org.wanggz.springboot.biz.customer;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/customer")
    public String home() {
        return "Hello World!";
    }
}
