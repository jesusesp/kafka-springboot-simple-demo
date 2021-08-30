package com.unosquare.demo.kafkaclient.service;

import com.unosquare.demo.kafkaclient.topic.UnicornTopic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topicPattern = UnicornTopic.NEW_UNICORN, groupId = "group1")
    public void consumeNewUnicorn(String message) throws IOException {
        log.info("New Unicorn: " + message);
    }

    @KafkaListener(topicPattern = UnicornTopic.RUN_UNICORN, groupId = "group1")
    public void consumeRunUnicorn(String message) throws IOException {
        log.info("Run Unicorn: " + message);
    }

}
