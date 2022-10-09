package com.home.kafkapoc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "MyFirstTopic";
    @GetMapping("/put/{message}")
    public String post(@PathVariable("message") final String message1){

        kafkaTemplate.send(TOPIC,message1);
        System.out.println(message1);
        return "Sent Message";
    }

}
