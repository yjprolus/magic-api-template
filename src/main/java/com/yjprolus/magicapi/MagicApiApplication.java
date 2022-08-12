package com.yjprolus.magicapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author  yjprolus
 * @date  2022/7/3  0003 21:29:56
 */

@SpringBootApplication
@AutoConfigureOrder
@EnableSwagger2
public class MagicApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MagicApiApplication.class, args);
    }
}
