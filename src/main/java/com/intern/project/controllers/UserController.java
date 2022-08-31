package com.intern.project.controllers;
import com.intern.project.dtos.UserDto;
import com.intern.project.exceptions.BadRequestException;
import com.intern.project.exceptions.NotFoundException;
import com.intern.project.services.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private IUserService userService;
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/inquireuser",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> inquireUser(@RequestBody UserDto userDto){
        return ResponseEntity.ok(this.userService.inquireUser(userDto));
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> create(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.create(userDto));
    }

    @GetMapping("/inquireUserTypes/{shortCode}")
    public ResponseEntity<List<UserDto>> getByTypeShortCode(@PathVariable String shortCode) {
        return ResponseEntity.ok(userService.getByTypeShortCode(shortCode));
    }
}