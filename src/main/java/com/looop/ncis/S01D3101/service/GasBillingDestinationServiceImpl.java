package com.looop.ncis.S01D3101.service;

import com.looop.ncis.S01D3101.dao.S01S4001Dao;
import com.looop.ncis.S01D3101.dao.S01S4001PrmDao;
import com.looop.ncis.S01D3101.dto.req.GasBillingDestinationReqDTO;
import com.looop.ncis.S01D3101.dto.res.GasBillingDestinationResDTO;
import com.looop.ncis.utility.PageResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GasBillingDestinationServiceImpl implements GasBillingDestinationService {

//    @Value("${app.crypto.key}")

    private final String cryptKey ="jpsg4tdugu";

    @Override
    public PageResponse<GasBillingDestinationResDTO> getBillingDestinationInfo(GasBillingDestinationReqDTO request) {
        S01S4001PrmDao daoPrm = new S01S4001PrmDao();
        
        daoPrm.setGBI_FEED_POINT_NUMBER((request.getGBI_FEED_POINT_NUMBER())); // 供給地点特定番号
        daoPrm.setGND_OLD_NUMBER((request.getBCC_CONTRACT_PHONE_NUMBER())); // 旧契約管理番号
        daoPrm.setGBI_BILLING_YEAR_MONTH((request.getGBI_BILLING_YEAR_MONTH())); // 対象年月
        daoPrm.setBILLINGDESTINATION_ID((request.getBILLINGDESTINATION_ID())); // 請求先ID
        daoPrm.setBILLINGPHONE_NUMBER((request.getBILLINGPHONE_NUMBER())); // 請求先電話番号
        daoPrm.setBILLING_NAME((request.getBILLING_NAME())); // 請求先氏名
        daoPrm.setBILLING_NAME_KANA((request.getBILLING_NAME_KANA())); // 請求先氏名カナ
        daoPrm.setBILLING_ADDRESS((request.getBILLING_ADDRESS())); // 請求先住所
        daoPrm.setSCT_CONTRACT_ID((request.getSCT_CONTRACT_ID())); // 使用契約ID
        daoPrm.setBCC_CONSUMER_NAME((request.getBCC_CONSUMER_NAME())); // 契約者氏名
        daoPrm.setBCC_CONSUMER_NAME_KANA((request.getBCC_CONSUMER_NAME_KANA())); // 契約者氏名カナ
        daoPrm.setBCC_CONTRACT_PHONE_NUMBER((request.getBCC_CONTRACT_PHONE_NUMBER())); // 契約者電話番号
        daoPrm.setBCC_CONTRACTOR_ADDRESS((request.getBCC_CONTRACTOR_ADDRESS())); // 契約者住所
        
        daoPrm.setCryptKey(cryptKey);

        S01S4001Dao S01S4001

        return null;

    }
}
