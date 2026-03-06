package com.looop.ncis.S01D0603.service;

import com.looop.ncis.S01D0603.dto.UserRegistrationRequestDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public interface UserRegistrationService {
    void registerUser(@Valid UserRegistrationRequestDto request, String currentSystemUser);
}
