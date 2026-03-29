# 🛒 Shopping List API

## 📌 Sobre o projeto

A **Shopping List API** é uma aplicação REST desenvolvida com Spring Boot que tem como objetivo facilitar a organização de compras do dia a dia, funcionando como uma lista de produtos domésticos.

Com ela, é possível cadastrar, visualizar, atualizar e remover itens de uma lista de compras, ajudando no controle de itens essenciais de forma simples e eficiente.

Este projeto foi desenvolvido com foco em boas práticas de desenvolvimento backend, organização de código e padrões utilizados no mercado.

---

## 🚀 Tecnologias utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* Banco de dados H2 (em memória)
* Lombok
* Swagger / OpenAPI

---

## 🧠 Conceitos aplicados

* Arquitetura em camadas (Controller, Service, Repository)
* Princípios SOLID
* DTO (Data Transfer Object)
* Mapper Pattern
* Validação com Bean Validation
* Padrão REST

---

## ⚙️ Funcionalidades

* ✅ Cadastrar produto
* ✅ Listar todos os produtos
* ✅ Buscar produto por ID
* ✅ Atualizar produto (parcial)
* ✅ Remover produto
* ✅ Documentação interativa com Swagger

---

## 🔗 Endpoints da API

| Método | Endpoint       | Descrição                 |
| ------ | -------------- | ------------------------- |
| POST   | /products      | Cadastrar um novo produto |
| GET    | /products      | Listar todos os produtos  |
| GET    | /products/{id} | Buscar produto por ID     |
| PATCH  | /products/{id} | Atualizar produto         |
| DELETE | /products/{id} | Remover produto           |

---

## 📖 Documentação da API (Swagger)

A documentação interativa pode ser acessada em:

http://localhost:8080/swagger-ui/index.html

---

## 🗄️ Banco de dados H2

O projeto utiliza o banco H2 em memória, ideal para testes e desenvolvimento.

Acesse o console do H2:

http://localhost:8080/h2-console

Configuração padrão:

* JDBC URL: `jdbc:h2:mem:testdb`
* User: `sa`
* Password: *(em branco)*

---

## ▶️ Como rodar o projeto

```bash
git clone https://github.com/RenatoCPereira/ShoppingList.git
cd ShoppingList
mvn spring-boot:run
```

---

## 📷 Exemplo de requisição

```json
{
  "name": "Arroz",
  "price": 20.50,
  "quantity": 2
}
```

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de:

* Praticar desenvolvimento backend com Spring Boot
* Aplicar boas práticas e padrões de projeto
* Simular um cenário real de organização de compras domésticas
* Servir como projeto de portfólio

---

## 👨‍💻 Autor

Renato Pereira
