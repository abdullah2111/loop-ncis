package com.looop.ncis.S01D0603.repository;

import com.looop.ncis.S01D0603.dto.UserRegistrationRequestDto;
import com.looop.ncis.S01D0603.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepository extends JpaRepository<User, Long> {
    boolean existsByUserId(String userId);
}
