[![CircleCI](https://circleci.com/gh/elleom/sf-pet-clinic.svg?style=svg)](https://github.com/elleom/sf-pet-clinic)
# Spring Framework
## Pet Clinic

Learning project base on [Spring Framework] (https://github.com/spring-projects/spring-petclinic)

* Java 8
* Circle CI
* JUnit 5
* Mockito
* SpringMVC
```
git clone https://github.com/spring-projects/spring-petclinic.git
cd spring-petclinic
./mvnw package
java -jar target/*.jar
```

You can then access petclinic here: http://localhost:8080/

<img width="1042" alt="petclinic-screenshot" src="https://cloud.githubusercontent.com/assets/838318/19727082/2aee6d6c-9b8e-11e6-81fe-e889a5ddfded.png">

Or you can run it from Maven directly using the Spring Boot Maven plugin. If you do this it will pick up changes that you make in the project immediately (changes to Java source files require a compile as well - most people use an IDE for this):

```
./mvnw spring-boot:run
```

> NOTE: Windows users should set `git config core.autocrlf true` to avoid format assertions failing the build (use `--global` to set that flag globally).


