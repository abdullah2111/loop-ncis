package com.looop.ncis.S01D1601.dto.req;

import com.looop.ncis.S01D1601.dto.res.ContractRowDTO;
import com.looop.ncis.S01D1601.dto.res.PagenateBean;
import com.looop.ncis.utility.CommonConstant;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;



@Getter
@Setter
public class ContractRequestDTO {
    /** 契約者電話番号 */
    private String T01_powerContractPhone = CommonConstant.STR_EMPTY;
    /** 供給地点特定番号 */
    private String T02_feedPointNumber = CommonConstant.STR_EMPTY;
    /** 旧契約管理番号 */
    private String T03_powerContractNumberOld = CommonConstant.STR_EMPTY;
    /** 契約者名 */
    private String T04_powerContractName = CommonConstant.STR_EMPTY;
    /** 請求先メールアドレス */
    private String T05_billingMailAddress = CommonConstant.STR_EMPTY;
    /** 契約開始日（from） */
    private String T06_powerContractStartFrom = CommonConstant.STR_EMPTY;
    /** 契約開始日（to） */
    private String T07_powerContractStartTo = CommonConstant.STR_EMPTY;
    /** 契約終了日（from） */
    private String T08_powerContractEndFrom = CommonConstant.STR_EMPTY;
    /** 契約終了日（to） */
    private String T09_powerContractEndTo = CommonConstant.STR_EMPTY;
    /** 契約ID */
    private String T10_ContractId = CommonConstant.STR_EMPTY;

    /** 現ページ数 */
    private int H02_requestPageNumber = 0;

    /** 契約情報リスト */
    private List<ContractRowDTO> contractRowBeanList = Collections.emptyList();

    /** ページボタン表示用 */
    private List<PagenateBean> s01D1601PagenateBeanList;
}
