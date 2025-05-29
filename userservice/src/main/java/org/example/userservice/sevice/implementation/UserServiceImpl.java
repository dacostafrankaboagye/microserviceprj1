package org.example.userservice.sevice.implementation;

import lombok.RequiredArgsConstructor;
import org.example.userservice.commonUtility.Utility;
import org.example.userservice.dto.UserDto;
import org.example.userservice.entity.UserEntity;
import org.example.userservice.repository.UserRepository;
import org.example.userservice.sevice.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserDto createUser(UserDto userDto) {
        UserEntity userEntity = Utility.mapUserDtoToUserEntity(userDto);

        // set the password
        userEntity.setEncryptedPassword(userDto.getPassword());

        UserEntity savedEntity =  userRepository.save(userEntity); // will change this implementation
        return Utility.mapUserEntityToUserDto(savedEntity);
    }
}
