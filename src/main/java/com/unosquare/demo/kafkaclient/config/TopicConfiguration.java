package com.unosquare.demo.kafkaclient.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {
    @Bean
    public NewTopic newTopic() {
        return TopicBuilder.name("unicorns")
                .partitions(2)
                .replicas(3)
                .build();
    }
}
