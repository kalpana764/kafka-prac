package com.ss.org.consumer;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class KafkaConsumer {

    @KafkaListener(topics = "demo", groupId = "groupId")
    public void consumeMessage(String message){
       log.info("Message consumed : {}", message);
    }

}
