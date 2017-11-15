package org.wanggz.springboot.consumer;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {

        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host : " + instance.getHost() + ", service_id : " + instance.getServiceId());
        String ret = JSON.toJSONString(instance.getMetadata());

        if ("{}".equals(ret)) {
            return "/hello, host : " + instance.getHost() + ", service_id : " + instance.getServiceId();
        } else {
            return ret;
        }
    }

}
