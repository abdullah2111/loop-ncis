package com.looop.ncis.S01D0603.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data; // Requires Lombok dependency

/**
 * Data Transfer Object for User Registration.
 * Replaces the legacy S01D0603FormBean.
 */
@Data
public class UserRegistrationRequestDto {

    @NotBlank(message = "Company prefix is required")
    private String companyIdPrefix="T01_1DH1007999";

    @NotBlank(message = "User ID is required")
    @Size(max = 64, message = "User ID must be less than 64 characters")
    @Pattern(regexp = "^[\\w!#$%&'*+/=?^`{|}~@.-]*$", message = "Invalid characters in User ID")
    private String inputUserId;

    @NotBlank(message = "User Name is required")
    @Size(max = 32, message = "User Name must be less than 32 characters")
    private String userName;

    @NotBlank(message = "Group ID is required")
    private String groupId;

    @NotBlank(message = "Status is required")
    private String status;

    // Optional field (no @NotBlank needed)
    private String agencyId;

    /**
     * Custom validation method ported from the legacy Action class.
     * Replaces: sUserID.indexOf('@', sUserID.indexOf('@')+1)>0
     * @return true if valid (1 or 0 '@' symbols), false if invalid.
     */
    public boolean hasValidAtSymbols() {
        if (this.inputUserId == null) return true; // Let @NotBlank handle nulls
        long atCount = this.inputUserId.chars().filter(ch -> ch == '@').count();
        return atCount <= 1;
    }
}