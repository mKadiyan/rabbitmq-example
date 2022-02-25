package com.poc.receiver.listener;

import com.poc.receiver.model.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class RabbitMQ {
    private AtomicLong count = new AtomicLong(0L);

    @RabbitListener(queues = "${sample.rabbitmq.queue}")
    public void recievedMessage(Message message) {
        System.out.println("( "+count.incrementAndGet()+" ) Received = : " + message);

    }
}