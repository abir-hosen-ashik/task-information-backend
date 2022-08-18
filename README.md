## Start

This is spring boot project, created for kanban support backend of rest api

### Prerequisite
- [ ] maven
- [ ] mysql

### Mysql Setup

```
user: abir
pass: 3323
db: ms_db
port: 3306
```

These avobe are configured in application.yml

you may configure application.yml for mysql according to your environment.

### Run project

```
mvn compile
mvn spring-boot:run
```


project will run on

[http://localhost:8085](http://localhost:8085)



`You may test API with Postman. 'Task.postman_collection.json' is the postman collection file.`