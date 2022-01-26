package com.poc.receiver.listener;

import com.poc.receiver.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class RabbitMQ {
    private AtomicLong count = new AtomicLong(0L);

    @RabbitListener(queues = "${sample.rabbitmq.queue}")
    public void recievedMessage(Notification notification) {
        System.out.println("( "+count.incrementAndGet()+" ) Received = : " + notification);

    }
}