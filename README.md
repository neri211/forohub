# 🚀 ForoHub API

Una API RESTful construida con Java y Spring Boot para gestionar el funcionamiento de un foro de discusiones. Este proyecto es la solución al desafío "ForoHub" de Alura Latam.

## 🛠️ Tecnologías Utilizadas

* **Java 17+**
* **Spring Boot 3**
* **Spring Security** (Autenticación sin estado)
* **Token JWT** (JSON Web Tokens con la librería Auth0)
* **Spring Data JPA** (Persistencia de datos)
* **MySQL** (Base de datos relacional)
* **Flyway** (Migraciones de base de datos)
* **Lombok** (Generación de código repetitivo)

## ✨ Características Principales

* **CRUD Completo de Tópicos:** Permite crear, listar, detallar y actualizar dudas o discusiones.
* **Borrado Lógico:** Los tópicos no se eliminan de la base de datos, sino que su estado cambia a `INACTIVO` para mantener un historial seguro.
* **Paginación y Ordenamiento:** El listado general devuelve los datos paginados (de 10 en 10) para optimizar el rendimiento.
* **Seguridad con JWT:** Todas las rutas (excepto el login) están protegidas. Se requiere enviar un Token JWT válido en los Headers (`Authorization: Bearer <token>`) para consumir la API.
* **Manejo de Errores (Controller Advice):** Respuestas limpias y profesionales (como devolver un `404 Not Found` genérico en lugar de la traza completa de la excepción cuando no se encuentra un ID).

## 🛣️ Endpoints (Rutas de la API)

| Método | Ruta | Descripción | Requiere Token |
| :--- | :--- | :--- | :---: |
| `POST` | `/login` | Autentica un usuario y devuelve el Token JWT. | ❌ |
| `GET` | `/topicos` | Lista todos los tópicos activos (paginados). | ✅ |
| `GET` | `/topicos/{id}` | Muestra el detalle de un tópico específico. | ✅ |
| `POST` | `/topicos` | Registra un nuevo tópico en la base de datos. | ✅ |
| `PUT` | `/topicos/{id}`| Actualiza el título y/o mensaje de un tópico. | ✅ |
| `DELETE`| `/topicos/{id}`| Realiza un borrado lógico del tópico. | ✅ |