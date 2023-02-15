# Curso de microservicios

_Este repositorio es para ejemplificar el manejo colas de RabbitMQ con Spring boot_

## Tech

Este proyecto utiliza las siguientes tecnologias:

- [Maven] - Software project management and comprehension tool.
- [Spring Framework] - Framework for fast, secure, and responsive web applications.
- [RabbitMQ] - widely deployed open source message broker.

## Installation

Este proyecto requiere [Java 17](https://www.oracle.com/java/technologies/downloads/) para correr.

Si no se cuenta con RabbitMQ instalado se puede utilizar un contenedor para ejecutarlo.

### A continuacion ejemplifico como instalar rabbitMQ con Docker.

```bash
  docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management
```

Para que el productor y el consumidor sepan de que cola consumir se debe especificar en los archivos properties de cada proyecto como se muestra en la siguiente imagen:

![screenshot](https://snipboard.io/Z8Kj7S.jpg)

## Run Locally

### Abrir RabbitMQ desde el navegador

```
  http://localhost:15672/

  user/pass: guest/guest
```

Para ejecutar este proyecto desde cualquier IDE se debe correr la clase main tanto del productor como del consumidor.

### Realizar una peticion desde postman

Path

```
  http://localhost:8081/test
```

Body

```javascript
  {
    "id": Integer,
    "message": "STRING"
  }
```

Al momento de enviar el mensaje, en la consola del consumidor se debe visualizar algo parecido a esto:

![screenshot](https://snipboard.io/gOpd6k.jpg)

## License

MIT

**Free Software, Hell Yeah!**

[//]: # "These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen."
[maven]: https://maven.apache.org/
[spring framework]: https://spring.io/
[rabbitmq]: https://www.rabbitmq.com/
