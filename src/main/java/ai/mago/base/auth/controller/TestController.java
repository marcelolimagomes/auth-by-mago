package ai.mago.base.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/test")
public class TestController {

    @GetMapping("all")
    public String getMessage() {
        return "ok";
    }

}
