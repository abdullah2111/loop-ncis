package com.looop.ncis.S01D1601.controller;

import com.looop.ncis.S01D1601.dto.req.ContractRequestDTO;
import com.looop.ncis.S01D1601.dto.res.ContractResponseDTO;
import com.looop.ncis.S01D1601.service.ContractService;
import com.looop.ncis.utility.PageResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contracts")
@RequiredArgsConstructor
public class ContractController {

    private final ContractService contractService;



    @GetMapping("/list")
    public PageResponse<ContractResponseDTO> searchContracts(ContractRequestDTO request) {

        return contractService.searchContracts(request);
    }



}
