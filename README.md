### Spotlight-REST-JPA

This is an example Java Spring Project implementing REST APIs for the spotlight project. 
It uses the following:
    - Spring 2.7
    - Java 17
    - Springfox/Swagger
    - JPA/Hibernate
    - Configured for a Postgres db target.
    
### Start postgres container
```cd devops```

```docker-compose up```

###    To Build :
```   mvn -e clean install```
    
###    To Run 
```   mvn exec:java -Dexec.mainClass="com.rrmackay.spotlight.SpotlightApplication"```
    
###    To excercise an endpoint:
####    open a browser to 
```   http://localhost:8080/swagger-ui/```


  ### Status:
     curently the project has the findAll interface method implmented and will only function against the postgres database for diagram, nodes, connectors list retrieval.
     
     Implemementing full CRUD operatons for all entities is underway. Current status includes operatons in jpa repository and jpa service