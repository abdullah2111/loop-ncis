package com.looop.ncis.S01D1601.service;

import com.looop.ncis.S01D1601.dto.req.ContractRequestDTO;
import com.looop.ncis.S01D1601.dto.res.ContractResponseDTO;
import com.looop.ncis.utility.PageResponse;
import jakarta.validation.Valid;

public interface ContractService {
    PageResponse<ContractResponseDTO> searchContracts(ContractRequestDTO request);
}
