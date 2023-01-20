### Spotlight-REST-JPA

This is an example Java Spring Project implmenting REST APIs for the spotlight project. 
It uses the wollowing:
    Spring
    Java 17
    JPA/Hibernate
    Springfox/Swagger
    Configured for a Postgres db target.
    
    To Build run:
    mvn -e clean install
    
    To Run 
    mvn exec:java -Dexec.mainClass="com.rrmackay.spotlight.SpotlightApplication"
    
    To excercise an endpoint:
    open a browser to 
    http://localhost:8080/swagger-ui/


  ### Status:
     curently the project only has the findAll interface method implmented and will only functoin against the postgres database for diagram list retrieval.
     nodes and connections have not been fully implmented and only returning placeholder data.
