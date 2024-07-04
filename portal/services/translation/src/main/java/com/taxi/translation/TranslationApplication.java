package com.taxi.translation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages ={"com.taxi.framework", "com.taxi.translation"})
@EntityScan("com.taxi.framework.translation.model")
public class TranslationApplication {

    public static void main(String[] args) {
        SpringApplication.run(TranslationApplication.class, args);
    }

}
