package com.ttabong.health;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("health")
public class Healthcheck {

    @RequestMapping("")
    public HttpStatus healthCheck() {
        return HttpStatus.OK;
    }
}
