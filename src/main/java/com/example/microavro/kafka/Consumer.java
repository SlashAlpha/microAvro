package com.example.microavro.kafka;


import com.example.microavro.User;
import lombok.extern.apachecommons.CommonsLog;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@CommonsLog(topic = "Consumer Logger")
public class Consumer {


    @Value("${topic.name}")
    private String topicName;

    @KafkaListener(topics = "${topic.name}", groupId = "my-group-id")
    public void consume(ConsumerRecord<String, User> record) {
        log.info(String.format("Consumed message -> %s", record.value()));
    }
}
