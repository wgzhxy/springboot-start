package org.wanggz.begin.app;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class HelloController {

    @RequestMapping("/hellohello")
    public String index() {
        List<String> ls = Stream.of("test", "test01", "test02", "test03", "test04").collect(Collectors.toList());
        return JSON.toJSONString(ls);
    }
}


