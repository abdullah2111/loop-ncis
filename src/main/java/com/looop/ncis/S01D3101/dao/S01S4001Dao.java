package com.looop.ncis.S01D3101.dao;

import lombok.Data;

@Data
public class S01S4001Dao {

    /** 事業者．事業者ＩＤ . */
    private String RateOutbreakIdSearch;

    /** 連携元（CPRE）事業者マスタ．親事業者+子事業者. */
    private String RateOutbreakIdDisplay;

    /** 事業者．事業者名称(漢字). */
    private String RateOutbreak;

    /** 請求事業者ＩＤ. */
    private String RequestCompanyId ;

    /** 請求先ID */
    private String billingId ;

    /** 支払方法 */
    private String paymentMethod;

    /** 請求先氏名 */
    private String billingName;

    /** 請求先住所 */
    private String billingAddress ;

    /** 顧客種別 */
    private String customerType ;

    /** 請求先ID表示用. */
    private String BillingDestinationIdDisplay ;

    /** 件数 */
    private int cnt = 0;
}
