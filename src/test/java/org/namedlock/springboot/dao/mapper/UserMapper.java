package org.namedlock.springboot.dao.mapper;

import org.namedlock.springboot.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = Integer.class, jdbcType = JdbcType.INTEGER
            ),
            @Result(property = "userName", column = "user_name")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Result(property = "userName", column = "user_name")
    })
    UserEntity getOne(Long id);

    @Insert("INSERT INTO users(user_name,password,user_sex) VALUES(#{userName}, #{password}, #{userSex,jdbcType=NUMERIC})")
    void insert(UserEntity user);

    @Update("UPDATE users SET user_name=#{userName},password=#{password} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);
}
