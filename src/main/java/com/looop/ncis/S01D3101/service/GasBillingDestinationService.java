package com.looop.ncis.S01D3101.service;

import com.looop.ncis.S01D3101.dto.req.GasBillingDestinationReqDTO;
import com.looop.ncis.S01D3101.dto.res.GasBillingDestinationResDTO;
import com.looop.ncis.utility.PageResponse;
import jakarta.validation.Valid;

public interface GasBillingDestinationService {

    PageResponse<GasBillingDestinationResDTO> getBillingDestinationInfo(GasBillingDestinationReqDTO request);
}
