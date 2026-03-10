package com.looop.ncis.S01D3101.dto.res;

import com.looop.ncis.S01D3101.dto.req.GasBillingDestinationReqDTO;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class GasBillingDestinationResInfoDTO {
    private String billingId;
    private String paymentMethod;
    private String billingName;
    private String billingAddress;
    private String customerType;
    private String rateOutbreakIdSearch;
    private String rateOutbreak;
    private String requestCompanyId;
    private String rateOutbreakIdDisplay;
    private String billingDestinationIdDisplay;

}
