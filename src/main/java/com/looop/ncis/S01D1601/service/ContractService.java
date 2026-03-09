package com.looop.ncis.S01D1601.service;

import com.looop.ncis.S01D1601.dto.req.ContractRequestDTO;
import jakarta.validation.Valid;

public interface ContractService {
    void getContractList(@Valid ContractRequestDTO contractRequestDTO);
}
