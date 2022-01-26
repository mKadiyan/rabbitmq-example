package com.poc.sender.controller;

import com.poc.sender.model.Notification;
import com.poc.sender.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class Controller {
    @Autowired
    private RabbitMQSender rabbitMQSender;

    @PostMapping(value = "/producer")
    public String producer(@RequestBody Notification notification) throws IOException {
        rabbitMQSender.send(notification);
        return "Message sent to the RabbitMQ Successfully";
    }
}