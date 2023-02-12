package com.gt.producer.utils;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 *
 * @author malopezl
 *
 * Se implementa Serializable porque rabbitMQ solo permite enviar datos de tipo
 * string o serializable
 */
@Getter
@ToString
@AllArgsConstructor
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String message;

}
