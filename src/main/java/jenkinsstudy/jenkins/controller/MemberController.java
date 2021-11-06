package jenkinsstudy.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/api/v1/hello")
    public String getHello(){
        return "Hello";
    }
}
