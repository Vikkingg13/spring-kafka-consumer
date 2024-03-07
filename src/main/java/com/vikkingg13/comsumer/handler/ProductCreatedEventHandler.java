package com.vikkingg13.comsumer.handler;

import com.vikkingg13.kafkacore.ProductCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "product-created-event-topic")
public class ProductCreatedEventHandler {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @KafkaHandler
    public void handler(ProductCreatedEvent productCreatedEvent) {
        LOGGER.info("Received event {}", productCreatedEvent.getTitle());
    }

}
