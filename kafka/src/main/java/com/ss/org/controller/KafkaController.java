package com.ss.org.controller;

import com.ss.org.producer.KafkaProducer;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/test")
@Log4j2
public class KafkaController {

    @Autowired
    KafkaProducer producer;

    @PostMapping("/produce")
    public void produce(@RequestParam String message){
        log.info("Kafka controller :: start");
        producer.produceMessage(message);
    }

}
