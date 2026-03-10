package com.looop.ncis.S01D3101.dao;

import lombok.Data;

@Data
public class S01S4001PrmDao {

    /** ユーザID. */
    private String USER_ID;
    /*
     *//** 料金発生事業者ID *//*
	private String RATE_OUTBREAK_ID_SEARCH;

	*//** 請求事業者ID *//*
	private String REQUEST_COMPANY_ID;
*/
    /** 請求先ID */
    private String BILLINGDESTINATION_ID;

    /** 請求先電話番号 */
    private String BILLINGPHONE_NUMBER;

    /** 請求先氏名 */
    private String BILLING_NAME;

    /** 請求先氏名カナ */
    private String BILLING_NAME_KANA;

    /** 請求先住所 */
    private String BILLING_ADDRESS;

    /** 供給地点番号 */
    private String GBI_FEED_POINT_NUMBER;

    /** 旧契約管理番号 */
    private String GND_OLD_NUMBER;

    /** 対象年月 */
    private String GBI_BILLING_YEAR_MONTH;

    /** 契約ID */
    private String SCT_CONTRACT_ID;

    /** 契約者電話番号１ */
    private String BCC_CONTRACT_PHONE_NUMBER;

    /** 契約者氏名(漢字) */
    private String BCC_CONSUMER_NAME;

    /** 契約者氏名(カナ) */
    private String BCC_CONSUMER_NAME_KANA;

    /** 契約者住所 */
    private String BCC_CONTRACTOR_ADDRESS;

    /** 出力開始行. */

    private int offset;
    /** 出力件数. */
    private int outputRow;

    /** 暗号化キー. */
    private String cryptKey;
}
