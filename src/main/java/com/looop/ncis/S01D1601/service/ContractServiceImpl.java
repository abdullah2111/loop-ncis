package com.looop.ncis.S01D1601.service;

import com.looop.ncis.S01D1601.dto.req.ContractRequestDTO;
import com.looop.ncis.S01D1601.dto.res.ContractResponseDTO;
import com.looop.ncis.S01D1601.mapper.ContractMapper;
import com.looop.ncis.utility.PageResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContractServiceImpl implements ContractService {
    private final ContractMapper contractMapper;

    private static final int DEFAULT_PAGE_SIZE = 50;

    @Value("${app.crypto.key}")
    private String cryptKey;

    @Value("${app.reference-date}")
    private String referenceDate;

    @Override
    public PageResponse<ContractResponseDTO> searchContracts(ContractRequestDTO request) {

        int offset = request.getPage() * request.getSize();

        request.setCryptKey(cryptKey);
        List<ContractResponseDTO> contracts =
                contractMapper.searchContracts(request, offset, request.getSize());

        long total = contractMapper.countContracts(request);

        return new PageResponse<>(
                contracts,
                total,
                request.getPage(),
                request.getSize()
        );
    }
}



