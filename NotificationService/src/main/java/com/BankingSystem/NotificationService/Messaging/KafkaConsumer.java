package com.BankingSystem.NotificationService.Messaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final String TOPIC = "transaction_notifications";

    @KafkaListener(topics = TOPIC, groupId = "notification-group")
    public void consume(String message){
        System.out.println("Received transaction details: " + message);
        // Process and handle the notification logic
    }
}
