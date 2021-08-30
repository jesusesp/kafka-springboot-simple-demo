package com.unosquare.demo.kafkaclient.controller;

import com.unosquare.demo.kafkaclient.service.IUnicornProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class UnicornController {

    @Autowired
    IUnicornProducer producer;

    @PostMapping("/publish/new/{message}")
    public void newUnicorn(@PathVariable String message) {
        producer.sendNewUnicorn(message);
    }

    @PostMapping("/publish/run/{message}")
    public void runUnicorn(@PathVariable String message) {
        producer.sendRunUnicorn(message);
    }

}
