package org.namedlock.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@MapperScan("org.namedlock.springboot.dao.mapper")  //或者在mapper上标注 @Mapper
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
