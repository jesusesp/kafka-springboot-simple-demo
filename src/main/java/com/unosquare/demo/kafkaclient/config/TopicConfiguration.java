package com.unosquare.demo.kafkaclient.config;

import com.unosquare.demo.kafkaclient.topic.UnicornTopic;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {
    @Bean
    public NewTopic newUnicornTopic() {
        return TopicBuilder.name(UnicornTopic.NEW_UNICORN)
                .partitions(1)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic runUnicornTopic() {
        return TopicBuilder.name(UnicornTopic.RUN_UNICORN)
                .partitions(1)
                .replicas(1)
                .build();
    }
}
