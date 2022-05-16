package com.galaxy.universe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {"classpath:application-test.yml, classpath:application.yml"})
class UniverseApplicationTests {

    @Value("${galaxy.universe.name:}")
    private String galaxyName;

    @Test
    void contextLoads() {
        System.out.println("test:: " + this.galaxyName);

    }
}
