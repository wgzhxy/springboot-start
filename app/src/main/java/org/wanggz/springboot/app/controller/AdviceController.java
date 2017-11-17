package org.wanggz.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class AdviceController {

    @RequestMapping("/advice")
    @ResponseBody
    public String getSomething() {
        return "This is my Tests";
    }
}
