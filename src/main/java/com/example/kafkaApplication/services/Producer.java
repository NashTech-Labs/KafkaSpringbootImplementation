package com.example.kafkaApplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    public static final String topics="myTopic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemp;

    public void  sendMessageToTopic(String msg){
        System.out.println("Published to topic:"+topics);
        this.kafkaTemp.send(topics,msg);
    }
}
