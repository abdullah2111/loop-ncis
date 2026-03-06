package com.looop.ncis.S01D0603.controller;

import com.looop.ncis.S01D0603.dto.UserRegistrationRequestDto;
import com.looop.ncis.S01D0603.service.UserRegistrationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserRegistrationController {

    private UserRegistrationService userRegistrationService;




    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody UserRegistrationRequestDto request){
        String currentSystemUser = "SYSTEM";

        // Delegate all heavy lifting to the Service layer
        userRegistrationService.registerUser(request, currentSystemUser);
        return ResponseEntity.status(HttpStatus.CREATED).body("User successfully registered.");
    }


}
