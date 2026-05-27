# FLUXIOAIR - Sistema de Reserva de Vuelos

Un sistema de gestión de vuelos y reservas de aerolínea desarrollado en Java para consola. Este proyecto fue diseñado aplicando **Programación Orientada a Objetos (POO)** bajo una **arquitectura en capas** (Entidades, Repositorios y Servicios), implementando conceptos clave como la herencia, el encapsulamiento y el **polimorfismo**.

## Características Principales
* **Gestión de Pasajeros:** Registro y control de la información de los usuarios del sistema.
* **Gestión de Vuelos Multiclase:** Creación de vuelos diferenciando entre:
* **Vuelos Nacionales:** Incluyen control de duración estimada y servicios a bordo (comida).
* **Vuelos Internacionales:** Manejo de país de destino, requerimiento de visado e impuestos/cargos internacionales adicionales.
* **Sistema de Reservas:** Control de compra y asignación de asientos por vuelo, validando la existencia de los pasajeros y la disponibilidad de los trayectos.
* **Cancelación Eficiente:** Permite dar de baja una reserva del sistema de manera dinámica.
* **Robustez en Consola:** Control total de excepciones (`NumberFormatException`) y consumo del buffer del teclado para evitar lecturas nulas o saltos inesperados.

## Arquitectura del Proyecto
El proyecto está estructurado siguiendo el patrón de diseño por capas para separar las responsabilidades de manera limpia:

* `entities`: Modelos de datos del sistema (`Passengers`, `Booking`, `Flies`, `domesticFlight`, `internationalFlight`).
* `repository`: Capa encargada del almacenamiento y persistencia de datos en estructuras dinámicas en memoria (`ArrayList`).
* `service`: Capa de lógica de negocio donde se aplican las reglas del sistema y las validaciones antes de impactar los repositorios.
* `Main`: Punto de entrada del programa con interfaz de usuario interactiva por consola.

## Tecnologías Utilizadas
* **Lenguaje:** Java 
* **Entorno de Desarrollo:** IntelliJ IDEA 
* **Control de Versiones:** Git y GitHub

## Ejecución del Proyecto
Para correr este proyecto de manera local, asegúrate de tener instalado el **JDK 17 o superior** .
