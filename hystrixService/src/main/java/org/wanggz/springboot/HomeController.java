package org.wanggz.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/getObject")
    public String getObject() {
        return "hellow";
    }

}
