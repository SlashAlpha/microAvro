package com.example.microavro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroAvroApplication {
//    @Value("${topic.name}")
//    private String topicName;
//
//    @Value("${topic.partitions-num}")
//    private Integer partitions;
//
//    @Value("${topic.replication-factor}")
//    private short replicationFactor;
//
//
//    @Bean
//    NewTopic moviesTopic() {
//        return new NewTopic(topicName, partitions, replicationFactor);
//    }

    public static void main(String[] args) {
        SpringApplication.run(MicroAvroApplication.class, args);
    }

}
