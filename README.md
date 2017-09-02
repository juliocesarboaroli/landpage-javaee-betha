# Orientações

O datasource do projeto foi adicionado diretamente no servidor, portanto é necessário fazer a configuração do mesmo.

```xml
<datasource jndi-name="java:jboss/datasources/PostgresDS" pool-name="PostgresDS" enabled="true" use-java-context="true">
    <connection-url>URL de conexão</connection-url>
    <driver>org.postgresql</driver>
    <security>
        <user-name>Usuário</user-name>
        <password>Senha</password>
    </security>
</datasource>
```
