// configuração do banco de dados H2 para teste
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

// mostra no log da aplicação o comando SQL executado pelo JPA
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
