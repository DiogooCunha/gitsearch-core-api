package org.diogo.gitsearchcoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.diogo"})
public class GitsearchCoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitsearchCoreApiApplication.class, args);
    }

}
