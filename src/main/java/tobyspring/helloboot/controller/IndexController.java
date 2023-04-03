package tobyspring.helloboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("hello")
    public String hello(String name) {
        return "Hello " + name;
    }
}
