### ���Mybatis����
```$xslt
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
</dependency>
```

### �������Դ���������� application.properties
```$xslt
<dependency>
    <groupId>org.hsqldb</groupId>
    <artifactId>hsqldb</artifactId>
    <scope>runtime</scope>
</dependency>
```

����
```$xslt
mybatis.type-aliases-package=org.namedlock.springboot.entity

# embeded database does not need to specify driverClassName & url
#spring.datasource.driverClassName = com.mysql.jdbc.Driver
#spring.datasource.url = jdbc:mysql://localhost:3306/test1?useUnicode=true&characterEncoding=utf-8
spring.datasource.username = sa
spring.datasource.password =
```

### Mapper ��д

```
��鿴UserMapper
org.namedlock.springboot.dao.mapper.UserMapper
```

### ������������Ӷ�mapper��ɨ��@MapperScan
```$xslt
@SpringBootApplication
//@MapperScan("org.namedlock.springboot.dao.mapper")  //������mapper�ϱ�ע @Mapper
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

### ��������鿴
```$xslt
org.namedlock.springboot.UserMapperTest
```