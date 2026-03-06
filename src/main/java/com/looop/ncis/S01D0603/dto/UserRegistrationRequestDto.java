package com.looop.ncis.S01D0603.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;

public class UserRegistrationRequestDto {
    @NotBlank(message = "Company prefix is required")
    String companyIdPrefix;

    @NotBlank(message = "User ID is required")
    @Size(max = 64, message = "User ID must be less than 64 characters")
    @Pattern(regexp = "^[\\w!#$%&'*+/=?^`{|}~@.-]*$", message = "Invalid characters in User ID")
    String inputUserId;

    @NotBlank(message = "User Name is required")
    @Size(max = 32, message = "User Name must be less than 32 characters")
    String userName;

    @NotBlank(message = "Group ID is required")
    String groupId;

    @NotBlank(message = "Status is required")
    String status;

    String agencyId;

}
