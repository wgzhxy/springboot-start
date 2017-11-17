package org.wanggz.springboot.biz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static Logger LOG = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String index() {
        LOG.info("index ---------------------------");
        return "index";
    }
}
