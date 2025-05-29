package org.example.userservice.commonUtility;

import org.example.userservice.dto.UserDto;
import org.example.userservice.entity.UserEntity;

public class Utility {

    // dto -> entity
    public static UserEntity mapUserDtoToUserEntity(UserDto  userDto){
        return UserEntity.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .build();
    }

    // entity -> dto
    public static UserDto mapUserEntityToUserDto(UserEntity userEntity){
        return UserDto.builder()
                .userId(userEntity.getUserId())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .email(userEntity.getEmail())
                .build();
    }
}
