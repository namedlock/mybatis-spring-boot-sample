package org.namedlock.springboot;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.namedlock.springboot.dao.mapper.UserMapper;
import org.namedlock.springboot.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Import(Application.class) //如果Application与Test在同一个package下，则不需要导入
public class UserMapperTest {

    @BeforeClass
    public static void init(){
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        builder = builder.setType(EmbeddedDatabaseType.HSQL).addScript(
                "createSchema.sql");
        builder.setName("testdb");
        EmbeddedDatabase db = builder.build();
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new UserEntity("aa", "a123456", 0));
        userMapper.insert(new UserEntity("bb", "b123456", 1));
        userMapper.insert(new UserEntity("cc", "b123456", 2));

        Assert.assertEquals(3, userMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = userMapper.getAll();
        System.out.println(users.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        testInsert();

        UserEntity user = userMapper.getOne(2l);
        System.out.println(user.toString());
        user.setUserName("neo");
        userMapper.update(user);
        Assert.assertTrue(("neo".equals(userMapper.getOne(2l).getUserName())));
    }
}