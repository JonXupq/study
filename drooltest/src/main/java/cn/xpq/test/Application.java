package cn.xpq.test;

import cn.xpq.test.service.MessageDroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Autowired private MessageDroolsService service;
    @RequestMapping("/")
    public String  test(){

        return service.fireRule();
    }
}
