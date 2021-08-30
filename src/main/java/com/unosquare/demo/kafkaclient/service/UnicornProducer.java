package com.unosquare.demo.kafkaclient.service;

import com.unosquare.demo.kafkaclient.topic.UnicornTopic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UnicornProducer implements IUnicornProducer {

    private
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void sendNewUnicorn(String message) {
        log.info("Producing message: " + message);
        this.kafkaTemplate.send(UnicornTopic.NEW_UNICORN, message);
    }

    public void sendRunUnicorn(String message) {
        log.info("Producing message: " + message);
        this.kafkaTemplate.send(UnicornTopic.RUN_UNICORN, message);
    }
}
