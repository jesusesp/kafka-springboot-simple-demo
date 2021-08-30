package com.unosquare.demo.kafkaclient.controller;

import com.unosquare.demo.kafkaclient.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class UnicornController {

    @Autowired
    Producer producer;

    @PostMapping("/publish/{message}")
    public void publish(@PathVariable String message) {
        producer.sendMessage(message);
    }

}
