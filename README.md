[![Java Maven Build Test](https://github.com/deepaksorthiya/spring-boot-session-with-redis/actions/workflows/maven-build.yml/badge.svg)](https://github.com/deepaksorthiya/spring-boot-session-with-redis/actions/workflows/maven-build.yml)

---

### ** Spring Boot Security Http Session With Redis **

---

# Getting Started

### Requirements:

```
Git: 2.47.1
Spring Boot: 3.4.1
Maven: 3.9+
Java: 17
Docker Desktop: Tested on 4.37.1
```

### Clone this repository:

```bash
git clone https://github.com/deepaksorthiya/spring-boot-session-with-redis.git
cd spring-boot-session-with-redis
```

### Build Project:

```bash
./mvnw clean package
```

### Start Docker:

```bash
docker compose up
```

### Run Project:

```bash
./mvnw spring-boot:run
```

OR

```bash
java -jar .\target\spring-boot-session-with-redis-0.0.1-SNAPSHOT.jar
```

## Run using Docker(Optional):

### Build Docker Image(docker should be running):

```bash
./mvnw clean spring-boot:build-image -DskipTests
```

OR

```bash
docker build -t deepaksorthiya/spring-boot-session-with-redis:0.0.1-SNAPSHOT . 
```

### Run Using Docker

```bash
docker run --name spring-boot-session-with-redis -p 8080:8080 deepaksorthiya/spring-boot-session-with-redis:0.0.1-SNAPSHOT
```

### Testing

http://localhost:8080<br>
username: user</br>
password: password</br>

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/maven-plugin/)
* [Create an OCI image](https://docs.spring.io/spring-boot/maven-plugin/build-image.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/reference/actuator/index.html)
* [Spring Web](https://docs.spring.io/spring-boot/reference/web/servlet.html)
* [Spring Security](https://docs.spring.io/spring-boot/reference/web/spring-security.html)
* [Spring Session](https://docs.spring.io/spring-session/reference/)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/reference/data/nosql.html#data.nosql.redis)
* [Thymeleaf](https://docs.spring.io/spring-boot/reference/web/servlet.html#web.servlet.spring-mvc.template-engines)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.
