package org.example.entity;

import static org.example.entity.mockData.*;

public class EntityManager {
    public static User createUser(){
       return User.builder()
               .firstName(createUserName())
               .lastName(createLastName())
               .email(createEmail())
               .number(createNumber())
               .currentAddress(createCurrentAddress()).build();
    }
}
