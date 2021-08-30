package com.unosquare.demo.kafkaclient.service;

import com.unosquare.demo.kafkaclient.topic.UnicornTopic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topicPattern = UnicornTopic.UNICORN_TOPIC, groupId = "group1")
    public void consume(String message) throws IOException {
        log.info("Message consumed: " + message);
    }
}
