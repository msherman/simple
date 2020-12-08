package com.mikeshermandev.simple;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SimpleController {

    @GetMapping(value = "/api/simple/number")
    Integer getNumber() {
        return ThreadLocalRandom.current().nextInt(0, 101);
    }
}
