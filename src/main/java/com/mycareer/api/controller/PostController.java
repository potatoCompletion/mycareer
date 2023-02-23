package com.mycareer.api.controller;

import com.mycareer.api.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Slf4j
@RestController
public class PostController {

    @PostMapping("/posts")
    public String post(@RequestBody @Valid PostCreate postCreate) {
        log.info("params={}", postCreate.toString());
        return "hello world";
    }
}
