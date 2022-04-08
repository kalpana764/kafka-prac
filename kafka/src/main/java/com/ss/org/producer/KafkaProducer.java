package com.ss.org.producer;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class KafkaProducer {

    @Value("${kafka.topic.name}")
    private String topicName;

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void produceMessage( String message){
        log.info("Producing message: {}", message);
        kafkaTemplate.send(topicName,message);
    }

}
