package com.looop.ncis.S01D1601.dto.res;

import com.looop.ncis.utility.CommonConstant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContractRowDTO {
    /** 行番号 */
    private int rowNumber;
    /** 契約者電話番号 */
    private String contractorPhoneNumber = CommonConstant.STR_EMPTY;
    /** 契約開始 */
    private String contractStartDate = CommonConstant.STR_EMPTY;
    /** 契約終了 */
    private String contractEndDate = CommonConstant.STR_EMPTY;
    /** 契約者名 */
    private String contractorName = CommonConstant.STR_EMPTY;
    /** 供給地点特定番号 */
    private String feedPointNumber = CommonConstant.STR_EMPTY;
    /** 旧契約管理番号 */
    private String powerContractNumberOld = CommonConstant.STR_EMPTY;
    /** 契約ID */
    private String powerContractId = CommonConstant.STR_EMPTY;
    /** 検索用年月日 */
    private String searchDate = CommonConstant.STR_EMPTY;

    /** 再エネメニューＩＤ. */
    private String reEnergyMenuId = CommonConstant.STR_EMPTY;
}
