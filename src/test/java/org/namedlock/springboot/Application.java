package org.namedlock.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@MapperScan("org.namedlock.springboot.dao.mapper")  //������mapper�ϱ�ע @Mapper
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
