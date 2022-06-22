package com.example.kafkaApplication.controller;

import com.example.kafkaApplication.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafkaApp")
public class KafkaController {
    @Autowired
    Producer producer;

    @PostMapping(value = "/post")
    public void sendMessage(@RequestParam("msg") String msg) {
        this.producer.sendMessageToTopic(msg);
    }

}
