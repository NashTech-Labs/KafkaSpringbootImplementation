package com.example.kafkaApplication.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "mytopic", groupId = "mygroupid")
    public void consumeFromTopic(String msg) {
        System.out.println("Consumed message:" + msg);
    }
}

