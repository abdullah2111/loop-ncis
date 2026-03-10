package com.looop.ncis.S01D3101.controller;

import com.looop.ncis.S01D1601.dto.res.ContractResponseDTO;
import com.looop.ncis.S01D3101.dto.req.GasBillingDestinationReqDTO;
import com.looop.ncis.S01D3101.dto.res.GasBillingDestinationResDTO;
import com.looop.ncis.S01D3101.service.GasBillingDestinationService;
import com.looop.ncis.utility.PageResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gasbillingdestination")
@RequiredArgsConstructor
public class GasBillingDestination {
    private final GasBillingDestinationService gasBillingDestinationService;

    @GetMapping("/info")
    public PageResponse<GasBillingDestinationResDTO> getGasBillingDestination(@Valid GasBillingDestinationReqDTO request){
        return gasBillingDestinationService.getBillingDestinationInfo(request);
    }
}
