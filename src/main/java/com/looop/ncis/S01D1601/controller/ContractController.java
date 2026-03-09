package com.looop.ncis.S01D1601.controller;

import com.looop.ncis.S01D1601.dto.req.ContractRequestDTO;
import com.looop.ncis.S01D1601.service.ContractService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contracts")
@RequiredArgsConstructor
public class ContractController {

    private final ContractService contractService;



    public ResponseEntity<?> getContractList(@Valid @RequestBody ContractRequestDTO contractRequestDTO) {
        contractService.getContractList(contractRequestDTO);
        return ResponseEntity.ok().build();
    }



}
