package org.wanggz.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class ServiceCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCloudApplication.class, args);
    }
}
