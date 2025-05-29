package org.example.userservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.userservice.dto.UserDto;
import org.example.userservice.sevice.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class AppController {

    private final UserService userService;

    @GetMapping("/status-check")
    public String checkStatus(){
        return "working..";
    }


    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        var dto = userService.createUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
}
