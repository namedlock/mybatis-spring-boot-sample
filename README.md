# mybatis-spring-boot-sample

### 添加Mybatis依赖
```$xslt
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
</dependency>
```

### 添加数据源依赖及配置 application.properties
```$xslt
<dependency>
    <groupId>org.hsqldb</groupId>
    <artifactId>hsqldb</artifactId>
    <scope>runtime</scope>
</dependency>
```

配置
```$xslt
mybatis.type-aliases-package=org.namedlock.springboot.entity

# embeded database does not need to specify driverClassName & url
#spring.datasource.driverClassName = com.mysql.jdbc.Driver
#spring.datasource.url = jdbc:mysql://localhost:3306/test1?useUnicode=true&characterEncoding=utf-8
spring.datasource.username = sa
spring.datasource.password =
```

### Mapper 编写

```
请查看UserMapper
org.namedlock.springboot.dao.mapper.UserMapper
```

### 在启动类中添加对mapper包扫描@MapperScan
```$xslt
@SpringBootApplication
//@MapperScan("org.namedlock.springboot.dao.mapper")  //或者在mapper上标注 @Mapper
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

### 测试类请查看
```$xslt
org.namedlock.springboot.UserMapperTest
```
