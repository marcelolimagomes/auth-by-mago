package ai.mago.base.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api")
public class PrivateController {

    @GetMapping("private")
    public String getMessage() {
        return "Hello from private API controller";
    }

}
