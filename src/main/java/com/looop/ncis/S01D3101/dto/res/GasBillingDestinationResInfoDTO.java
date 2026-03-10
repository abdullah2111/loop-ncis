package com.looop.ncis.S01D3101.dto.res;

import com.looop.ncis.S01D3101.dto.req.GasBillingDestinationReqDTO;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class GasBillingDestinationResInfoDTO {
    private String receiptId ;

    /**
     * 供給地点特定番号.
     */
    private String gasFeedPointCode ;

    /**
     * 契約管理番号.
     */
    private String contractNumber ;

    /**
     * 対象年月.
     */
    private String targetYearMonth ;

    /**
     * 請求先ID.
     */
    private String billingId ;

    /**
     * 請求先電話番号.
     */
    private String billingPhoneNumber ;

    /**
     * 請求先名.
     */
    private String billingName ;

    /**
     * 請求先名カナ.
     */
    private String billingNameKana ;

    /**
     * 請求先住所.
     */
    private String billingAddress ;

    /**
     * 使用契約ID.
     */
    private String contractId ;

    /**
     * 契約者電話番号.
     */
    private String contractPhoneNumber ;

    /**
     * 契約者名.
     */
    private String contractName ;

    /**
     * 契約者名カナ.
     */
    private String contractNameKana ;

    /**
     * 契約者住所.
     */
    private String contractAddress ;

    /** 請求依頼元事業者ID_表示用. */
    private String H01_RequestClient;
    /** 請求依頼元事業者ID_表示用. */
    private String H01_RequestClientIdDisplay;
    /** 料金発生事業者ID_検索用. */
    private String H02_RateOutbreakIdSearch;
    /** 料金発生事業者ID_表示用. */
    private String H03_RateOutbreakIdDisplay;
    /** 料金発生事業者_表示用. */
    private String H04_RateOutbreak;
    /** 請求先ID. */
    private String H05_BillingDestinationId;
    /** 支払方法. */
    private String H06_PaymentMethod;
    /** 請求先氏名. */
    private String H07_BillingDestinationName;
    /** 請求先住所. */
    private String H08_BillingDestinationAddr;
    /** 顧客種別 */
    private String H09_PrivateCorporate;
    /** 請求事業者ID */
    private String H10_RequestCompanyId;
    /** 請求先ID表示用 */
    private String H11_BillingDestinationIdDisplay;

    /** 初期表示フラグ */
    private boolean InitDisplay;

    /** 現ページ数 */
    private int H02_requestPageNumber = 0;

    /** 請求先情報リスト */
    private List<GasBillingDestinationReqDTO> billingRowBeanList;

    /** 総件数  */
    private String totalCnt;

}
