package ru.kut.epamWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }

    @GetMapping("/main")
    public String mainPage() {
        return "mainPage";
    }
}
