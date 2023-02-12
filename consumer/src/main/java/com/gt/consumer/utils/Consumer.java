package com.gt.consumer.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 *
 * @author malopezl
 */
@Slf4j
@Component
public class Consumer {

    //anotacion que permite pasar una coleccion de colas para que el consumer la escuche
    @RabbitListener(queues = {"${ulf.queue.name}"})
    public void receive(@Payload String message) {
        log.info("Mensaje recibido {}", message);
        //funcion de prueba para lectura de mensajes cada 5 segundos
        makeSlow();
    }

    private void makeSlow() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
