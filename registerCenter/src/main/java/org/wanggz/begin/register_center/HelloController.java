package org.wanggz.begin.register_center;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class HelloController {

    @Value("${book.name}")
    String name;

    @Value("${book.author}")
    String author;

    @Value("${book.desc}")
    String desc;

    private Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String index() {

        LOG.info("name : " + name);
        LOG.info("author : " + author);
        LOG.info("desc : " + desc);

        List<String> ls = Stream.of("test", "test01", "test02", "test03", "test04").collect(Collectors.toList());
        return JSON.toJSONString(ls);
    }
}


