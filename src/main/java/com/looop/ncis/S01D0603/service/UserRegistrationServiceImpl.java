package com.looop.ncis.S01D0603.service;

import com.looop.ncis.S01D0603.config.SecurityConfig;
import com.looop.ncis.S01D0603.dto.UserRegistrationRequestDto;
import com.looop.ncis.S01D0603.entity.User;
import com.looop.ncis.S01D0603.repository.UserRegistrationRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@AllArgsConstructor
public class UserRegistrationServiceImpl implements UserRegistrationService {

    private final UserRegistrationRepository repo;
    private final SecurityConfig config;

    @Override
    @Transactional
    public void registerUser(UserRegistrationRequestDto request, String currentSystemUser) {

        String fullUserId = request.getCompanyIdPrefix() + request.getInputUserId();

        if (repo.existsByUserId(fullUserId)) {
            throw new IllegalStateException("User already exists: " + fullUserId);
        }

        User user = new User();
        user.setUserId(fullUserId);
        user.setUserName(request.getUserName());
        user.setGroupId(request.getGroupId());
        user.setAccountId(request.getAgencyId());
        user.setStatus(request.getStatus());
        user.setRegisterDateTime(LocalDateTime.now());
        user.setUpdateDateTime(LocalDateTime.now());
        user.setLoginErrorCount(0);
        user.setRegisterUser(currentSystemUser);
        user.setUpdateUser(currentSystemUser);
        user.setLastLoginDateTime(LocalDateTime.now());


        // TODO: password
        user.setLoginPassword(config.passwordEncoder().encode(fullUserId));
        user.setPasswordSettingDate(LocalDateTime.now().toString());

        User saved = repo.save(user);

    }
}
