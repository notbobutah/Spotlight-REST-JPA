# Spotlight-REST-JPA

This is an example Java Spring Project implmenting REST APIs for the spotlight project. 
It uses the wollowing:
- Spring
- Java 17
- JPA/Hibernate
- Springfox/Swagger
- Configured for a Postgres db target.
    
###   To Build run:

```mvn -e clean install```
    
###   To Run 

```mvn exec:java -Dexec.mainClass="com.rrmackay.spotlight.SpotlightApplication"```
    
###    To excercise an endpoint:
###    open a browser to 
    http://localhost:8080/swagger-ui/


  ### Status:
     the project has the findAll interface method implmented and function against the postgres database for diagrams, nodes and connectors list retrieval. Expanding CRUD operations against all entities

     Have yet to add data specific unit tests to project
