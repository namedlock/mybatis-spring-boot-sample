package org.namedlock.springboot.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserEntity {
    private long id;
    private int userSex;
    private String userName;
    private String password;

    public UserEntity(){

    }
    public UserEntity(String nickName, String password, int userSex){
        this.userName=nickName;
        this.password=password;
        this.userSex=userSex;
    }
}
