package com.home.kafkapoc.resource;

import com.home.kafkapoc.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class publishKafkaJson {
    @Autowired
    private KafkaTemplate<String, UserInfo> kafkaTemplate;
    private static final String TOPIC = "MyFirstTopic";
    @GetMapping("/send/json/{name}")
    public String post(@PathVariable("name") final String name1){
        kafkaTemplate.send(TOPIC, new UserInfo(name1,"Shawbury",43035L));
        System.out.println(name1);
        return "Sent Message";
    }

}
