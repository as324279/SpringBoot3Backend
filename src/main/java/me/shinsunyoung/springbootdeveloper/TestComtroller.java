package me.shinsunyoung.springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestComtroller {
    @GetMapping("/test")
    public String test() {
        return "hello, world";
    }
}
