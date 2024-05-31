# 🚀 Microservicios con Spring Boot

Este es un proyecto de microservicios construido con Spring Boot. Proporciona una arquitectura escalable y modularizada para desarrollar aplicaciones distribuidas.

## 📂 Estructura del Proyecto

El proyecto está organizado en los siguientes microservicios:

1. **config:** Servicio de configuración centralizada utilizando Spring Cloud Config.
2. **eureka:** Servicio de registro y descubrimiento de servicios con Eureka Server.
3. **gateway:** Servicio de enrutamiento y entrada a la aplicación utilizando Spring Cloud Gateway.
4. **{Otros Servicios}:** Lista de otros microservicios que conforman la lógica de negocio de la aplicación.

## ⚙️ Configuración

Antes de ejecutar los microservicios, asegúrate de haber configurado adecuadamente los archivos de propiedades en el servicio `config`. Este servicio debe estar en funcionamiento antes de ejecutar cualquier otro microservicio, ya que los demás servicios consultarán su configuración a través de él.

## ⚡ Orden de Ejecución

Sigue este orden para ejecutar los microservicios:

1. **Config:** `./mvnw spring-boot:run`
2. **Eureka:** `./mvnw spring-boot:run`
3. **Gateway:** `./mvnw spring-boot:run`
4. **{Otros Servicios}:** `./mvnw spring-boot:run`

Asegúrate de que cada microservicio esté en funcionamiento antes de ejecutar el siguiente.

## ▶️ Cómo Ejecutar

Cada microservicio se puede ejecutar individualmente utilizando el comando `./mvnw spring-boot:run` dentro de su directorio correspondiente.
