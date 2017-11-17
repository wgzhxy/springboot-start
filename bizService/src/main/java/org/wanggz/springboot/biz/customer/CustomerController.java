package org.wanggz.springboot.biz.customer;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class CustomerController {

    @RequestMapping(value = "/customer", produces = "text/plain;charset=UTF-8")
    public String home() {
        return "Hello World，Good One!";
    }

    @RequestMapping(value = "/getCustomerJson", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Customer getCustomerForjson() {
        Customer customer = new Customer();
        customer.setAddress("文一西路965号");
        customer.setAge(25);
        customer.setName("光忠");
        customer.setNickName("东往");
        return customer;
    }

    @RequestMapping(value = "/getCustomerXml", produces = {"application/xml;charset=UTF-8"})
    @ResponseBody
    public Customer getCustomerForXml() {
        Customer customer = new Customer();
        customer.setAddress("文一西路969号");
        customer.setAge(30);
        customer.setName("guangzhong");
        customer.setNickName("john");
        return customer;
    }

    @RequestMapping(value = "/{params_1}/{params_2}/getXml", produces = {"application/xml;charset=UTF-8"})
    @ResponseBody
    public Customer getString(@PathVariable String params_1, @PathVariable String params_2) {
        Customer customer = new Customer();
        customer.setNickName(params_2);
        customer.setName(params_1);
        return customer;
    }
}
