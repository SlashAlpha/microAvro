package com.example.microavro.kafka;

import com.example.microavro.User;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@CommonsLog(topic = "Producer Logger")
public class Producer {

    private final KafkaTemplate<String, User> kafkaTemplate;
    @Value("${topic.name}")
    private String TOPIC;

    @Autowired
    public Producer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    void sendMessage(User user) {
        this.kafkaTemplate.send(this.TOPIC, user.getName(), user);


    }
}
