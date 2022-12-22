# Api Checklist Royal

- Api para aplicação Checklist Royal

- ##  Definição do projeto

  - Nome : Api Checklist Royal
  - Descrição : API com regras de negocios e interação com banco
  - Objetivo : Disponibilizar regras de negocios e interação com banco de dados, para não ter sobrecarga no front e perda de dados

- ### Definição da tecnologia

    1. Java
    2. Spring Boot
    3. PostgreSQL

- ### Requisitos

    1. Ter instalado em sua máquina alguma IDE Java e postgreSQl instalado e configurado

---

- ## Executar projeto

1. Clone este repositorio em sua maquina utilizando o gitbash:

```bash

 git clone "https://github.com/giovanesantiago/api-checklist-entregas"

```

2.Abra o Projeto com a IDE :

3.Criar arquivo *application.properties* dentro do diretorio **"src/main/resources/"**

4.Abra o aquivo *application.properties* cole as configurações abaixo dentro do arquivo.

### Obs: Altere as informações que contem a palavra **configure** de acordo com as configurações de seu Banco PostgreSQL

```properties
spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER
server.error.include-exception=false
server.error.include-message=always


spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update


spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://configure.URL.do.banco.local
spring.datasource.username=configure.usuario.do.banco
spring.datasource.password=configure.senha.do.banco
```

5.Execute o projeto pela Classe principal ApiChecklistEntregasApplication.java.
