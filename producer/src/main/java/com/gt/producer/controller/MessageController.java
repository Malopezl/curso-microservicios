package com.gt.producer.controller;

import com.gt.producer.service.MessageService;
import com.gt.producer.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author malopezl
 */
@RestController
@RequestMapping(value = "test")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("")
    public void testSendMessage(@RequestBody Message message) {
//        String message = "hola mundo";
        this.messageService.sendToRabbit(message);
    }

}
