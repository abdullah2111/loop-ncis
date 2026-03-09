package com.looop.ncis.S01D1601.dao;

import com.looop.ncis.utility.CommonConstant;
import lombok.Data;

@Data
public class S01S2002PrmDao {
    /** 契約者電話番号. */
    private String contractorPhoneNumber = CommonConstant.STR_EMPTY;
    /** 供給地点番号. */
    private String feedPointNumber = CommonConstant.STR_EMPTY;
    /** 旧契約管理番号. */
    private String oldNumber = CommonConstant.STR_EMPTY;
    /** 契約者氏名（漢字）. */
    private String contractorName = CommonConstant.STR_EMPTY;
    /** 請求先メールアドレス. */
    private String billingMailAddress = CommonConstant.STR_EMPTY;
    /** 契約開始年月日. */
    private String contractStartDateFrom = CommonConstant.STR_EMPTY;
    /** 契約開始年月日. */
    private String contractStartDateTo = CommonConstant.STR_EMPTY;
    /** 契約終了年月日. */
    private String contractEndDateFrom = CommonConstant.STR_EMPTY;
    /** 契約終了年月日. */
    private String contractEndDateTo = CommonConstant.STR_EMPTY;
    /** 契約ID. */
    private String contractId = CommonConstant.STR_EMPTY;
    /** 基準日. */
    private String referenceDate = CommonConstant.STR_EMPTY;

    /** 出力開始行. */
    private int offset;
    /** 出力件数. */
    private int outputRow;

    /** 暗号化キー. */
    private String cryptKey = CommonConstant.STR_EMPTY;
    /** ユーザID. */
    private String userId = CommonConstant.STR_EMPTY;
}
