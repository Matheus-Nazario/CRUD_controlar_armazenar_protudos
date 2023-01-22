# ☕ 🍃 CRUD - Controlar & Armazenar Protudos 

Projeto é um CRUD que tem o objetivo de controlar e armazenar qualquer produto, é necessário informar o CEP do distribuidor no corpo, pois o mesmo realiza uma validação e consulta em API externa o [“ViaCEP”](https://viacep.com.br), extrai o endereço e armazena junto com o produto.

O intuito do desenvolvimento é trabalhar padrões de projetos com design pattern, com as dependências Spring Boot, Spring Data, Spring Cloud.

<p align="center">
	<img alt="Repository language count" src="https://img.shields.io/github/languages/count/Matheus-Nazario/CRUD_controlar_armazenar_protudos">
	<a href="https://www.linkedin.com/in/matheus-naz%C3%A1rio-676411b3/">
		<img alt="Made by Matheus Nazário" src="https://img.shields.io/badge/Made%20By-Matheus%20Naz%C3%A1rio-green">
	</a>
	<a href="https://github.com/Matheus-Nazario/CRUD_controlar_armazenar_protudos/commits/master">
		<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Matheus-Nazario/CRUD_controlar_armazenar_protudos?color=blue">
	</a>
	<img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen?color=blue">
</p>

<p align="center">
	<a href="https://www.oracle.com/br/java/">
	  <img alt="Java" src="https://img.shields.io/static/v1?color=red&label=Dev&message=Java&style=for-the-badge&logo=Java">
	</a>
</p>

# ⛏  Tech & Dependências

### Pré-requisitos

*   Java 11
*   Maven 3.8.1 ou superior

Para iniciar este projeto, foi utilizado o [spring initializr](https://start.spring.io/) utilizando as opções:
* Project: Maven Project;
* Language: Java 11;
* Spring Boot: 2.6.0;
* Dependencies: Spring Web, Spring Data JPA, H2 Database e OpenFeign.

Dependência adicionada manualmente no `pom.xml`: [Springdoc OpenAPI UI v1.5.12](https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui/1.5.12).

<hr>

## Clonando o serviço

```sh
git clone https://github.com/Matheus-Nazario/CRUD_controlar_armazenar_protudos.git
 
```

# Executando o serviço

Na pasta raiz do projeto executar o comando:

```sh
  ./mvnw spring-boot:run
```

<hr>

### Padrões e conceitos apresentados no Projeto:

* *Singleton*: Padrão Criacional que permite a criação de uma única instância de uma classe e fornecer um modo para recuperá-la;

* *Strategy*: Padrão Comportamental com objetivo de simplificar a variação de algoritmos para a resolução de um mesmo problema;

* *Facade*: Padrão Estrutural que visa prover uma interface que reduza a complexidade nas integrações com subsistemas.

A relação entre Padrões de Projetos com Java e o spring framework pode-se ser percebida em:
* Annotations *@Bean* e *@Autowired* como padrão criacional **Singleton**;
* Annotations *@Service* e *@Repository* como padrão comportamental **Strategy**;
* Annotation *@RestController* como padrão estrutural **Facade**.

<hr>

### Doc Swagger:

```sh
http://127.0.0.1:8080/swagger-ui.html
```

Minimun Payload in POST: 
```JSON
{
  "name": "string",
  "ean": "string",
  "unity": "string",
  "distributors": [
    {
      "name": "string",
      "comments": "string",
      "address": {
        "cep": "stringCepWith8Numbers"
      },
	  "addressNumber": 1
    }
  ]
}
```
Example:
```JSON
{
  "name": "Lápis",
  "ean": "01564715644225",
  "unity": "Peça",
  "distributors": [
    {
      "name": "Faber Castell",
      "comments": "Fabricante de canetas",
      "address": {
        "cep": "06447130"
      },
      "addressNumber": 800
    }
  ]
}
```

<hr>

Links Interessantes:

* IDE: [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/);
* [jsonschema2pojo.org](https://www.jsonschema2pojo.org);
* [ViaCEP](https://viacep.com.br);
* [Entendendo os conceitos dos Padrões de Projetos em Java - Devmedia](https://www.devmedia.com.br/entendendo-os-conceitos-dos-padroes-de-projetos-em-java/29083).

