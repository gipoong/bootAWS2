package com.gipoong.bootaws2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // JPA Auditing 활성화
@SpringBootApplication
public class BootAws2Application {

    public static void main(String[] args) {

        SpringApplication.run(BootAws2Application.class, args);
    }

}
