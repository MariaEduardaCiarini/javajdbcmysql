# 📦 Bônus: Projeto Web Service com Spring Boot e JPA/Hibernate

Este repositório contém o projeto desenvolvido durante a seção bônus do curso de **Java Completo** ministrado por **Nélio Alves**, que aborda a criação de um **Web Service RESTful** com **Spring Boot** e **JPA/Hibernate**.

## 📚 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- H2 Database (ambiente de testes)
- PostgreSQL ou MySQL (produção)
- Maven
- Postman (para testes de API)
- JPA Annotations (mapeamento objeto-relacional)

## 📁 Estrutura do projeto

- src/
- ├── main/
- │   ├── java/
- │   │   └── com/
- │   │       └── cursojava/
- │   │           └── jpawebservice/
- │   │               ├── config/
- │   │               ├── entities/
- │   │               │   ├── enums/
- │   │               │   ├── pk/
- │   │               │   ├── Category.java
- │   │               │   ├── Order.java
- │   │               │   ├── OrderItem.java
- │   │               │   ├── Payment.java
- │   │               │   ├── Product.java
- │   │               │   └── User.java
- │   │               ├── repositories/
- │   │               ├── resources/
- │   │               │   ├── exceptions/
- │   │               │   ├── CategoryResource.java
- │   │               │   ├── OrderResource.java
- │   │               │   ├── ProductResource.java
- │   │               │   └── UserResource.java
- │   │               ├── services/
- │   │               │   ├── exceptions/
- │   │               │   │   ├── DatabaseException.java
- │   │               │   │   └── ResourceNotFoundException.java
- │   │               │   ├── CategoryService.java
- │   │               │   ├── OrderService.java
- │   │               │   ├── ProductService.java
- │   │               │   └── UserService.java
- │   │               └── JpawebserviceApplication.java
- │   └── resources/
- │       ├── application.properties
- │       └── application-test.properties


## ✅ Funcionalidades

- CRUD completo de entidades com mapeamento relacional
- Endpoints RESTful
- Tratamento de exceções personalizado
- Relacionamentos entre entidades (`@OneToMany`, `@ManyToOne`, `@ManyToMany`)
- Paginação e ordenação de resultados
- Testes com Postman

## 🧠 Aprendizados
*Este projeto reforça os seguintes conceitos*:

- Criação de APIs REST com Spring Boot

- Persistência de dados com JPA/Hibernate

- Boas práticas de design de camadas (Controller, Service, Repository)

- Manipulação de exceções em APIs

- Integração com banco de dados
