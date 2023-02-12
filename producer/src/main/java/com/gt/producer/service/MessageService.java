package com.gt.producer.service;

import com.gt.producer.utils.Message;
import com.gt.producer.utils.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author malopezl
 */
@Slf4j
@Service
public class MessageService {

    @Autowired
    private Producer producer;

    public void sendToRabbit(Message message) {
        log.info("Mensaje '{}' recibido.", message);
        log.info("Enviando mensaje");
        this.producer.send(message);
    }

}
