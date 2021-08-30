package com.unosquare.demo.kafkaclient.service;

import com.unosquare.demo.kafkaclient.topic.UnicornTopic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Producer {

    private
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Producing message: " + message);
        this.kafkaTemplate.send(UnicornTopic.UNICORN_TOPIC, message);
    }
}
