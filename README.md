# Calculadora Científica Restful

Este é um projeto Maven baseado no Spring Boot para criar uma aplicação de calculadora científica com funcionalidades RESTful.

## Pré-requisitos

- Java 17
- Maven
- Spring Boot 2.6.5

## Configuração do Projeto

Este projeto utiliza o Maven para gerenciamento de dependências e construção do projeto.

### Dependências

- [Spring Boot Starter Web](https://spring.io/projects/spring-boot)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools)
- [Spring Boot Starter Test](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-testing)

## Como Executar

Você pode executar a aplicação utilizando o comando Maven:

```bash
mvn spring-boot:run
```

Isso irá iniciar o servidor e você poderá acessar a aplicação em `http://localhost:8080`.

## Endpoints

A aplicação possui os seguintes endpoints:

- `GET /soma/{a}/{b}`: Retorna a soma de `a` e `b`.
- `GET /subtracao/{a}/{b}`: Retorna a subtração de `a` por `b`.
- `GET /multiplicacao/{a}/{b}`: Retorna a multiplicação de `a` por `b`.
- `GET /divisao/{a}/{b}`: Retorna a divisão de `a` por `b`.
  
---

## Licença

Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
