package com.looop.ncis.S01D3101.service;

import com.looop.ncis.S01D3101.dto.req.GasBillingDestinationReqDTO;
import com.looop.ncis.S01D3101.dto.res.GasBillingDestinationResInfoDTO;
import com.looop.ncis.utility.PageResponse;

public interface GasBillingDestinationService {

    PageResponse<GasBillingDestinationResInfoDTO> getBillingDestinationInfo(GasBillingDestinationReqDTO request);
}
