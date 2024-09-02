plugins {
    java
    id("org.springframework.boot") version "3.3.2"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "ru.pugovishnikova"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-thymeleaf
    implementation ("org.springframework.boot:spring-boot-starter-web:3.3.2")
    implementation ("org.springframework.boot:spring-boot-devtools:3.3.2")
    implementation ("org.springframework.boot:spring-boot-starter-thymeleaf:3.3.2")
    implementation ("org.hibernate.validator:hibernate-validator:8.0.1.Final")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    compileOnly("org.projectlombok:lombok")
    implementation ("javax.xml.bind:jaxb-api:2.4.0-b180830.0359")
    implementation ("jakarta.persistence:jakarta.persistence-api:3.2.0")
    implementation ("org.hibernate:hibernate-core:4.1.4.Final")
    implementation ("org.hibernate:hibernate-entitymanager:6.0.0.Alpha7")
    implementation ("com.fasterxml.uuid:java-uuid-generator:5.1.0")
    developmentOnly("org.springframework.boot:spring-boot-docker-compose")
    runtimeOnly("com.oracle.database.jdbc:ojdbc11")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    annotationProcessor("org.projectlombok:lombok")
    runtimeOnly ("org.postgresql:postgresql")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation ("org.mapstruct:mapstruct:1.5.5.Final")
    implementation ("org.liquibase:liquibase-core:4.29.1")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
