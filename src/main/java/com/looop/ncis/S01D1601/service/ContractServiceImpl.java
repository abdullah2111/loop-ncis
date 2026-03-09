package com.looop.ncis.S01D1601.service;

import com.looop.ncis.S01D1601.dao.S01S2002Dao;
import com.looop.ncis.S01D1601.dao.S01S2002PrmDao;
import com.looop.ncis.S01D1601.dto.req.ContractRequestDTO;
import com.looop.ncis.S01D1601.mapper.ContractListMapper;
import com.looop.ncis.utility.CommonConstant;
import com.looop.ncis.utility.CommonItemName;
import com.looop.ncis.utility.GetBusinessDate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
@AllArgsConstructor
public class ContractServiceImpl implements ContractService {
    private final GetBusinessDate getBusinessDate;
    private final ContractListMapper mapper;



    @Override
    public void getContractList(ContractRequestDTO contractRequestDTO) {

        S01S2002PrmDao daoPrm = new S01S2002PrmDao();

        daoPrm.setContractorPhoneNumber( toLikeString( removeHyphen( contractRequestDTO.getT01_powerContractPhone() ) ) );
        daoPrm.setFeedPointNumber( toLikeString( contractRequestDTO.getT02_feedPointNumber() ) );
        daoPrm.setOldNumber( toLikeString( contractRequestDTO.getT03_powerContractNumberOld() ) );
        daoPrm.setContractorName( toLikeString( contractRequestDTO.getT04_powerContractName() ) );
        daoPrm.setBillingMailAddress( toLikeString( escapePercent( contractRequestDTO.getT05_billingMailAddress() ) ) );
        daoPrm.setContractStartDateFrom( removeHyphen( contractRequestDTO.getT06_powerContractStartFrom() ) );
        daoPrm.setContractStartDateTo( removeHyphen( contractRequestDTO.getT07_powerContractStartTo() ) );
        daoPrm.setContractEndDateFrom( removeHyphen( contractRequestDTO.getT08_powerContractEndFrom() ) );
        daoPrm.setContractEndDateTo( removeHyphen( contractRequestDTO.getT09_powerContractEndTo() ) );
        daoPrm.setReferenceDate( String.valueOf( getBusinessDate.getOperationDate() ) );
        daoPrm.setContractId( toLikeString( contractRequestDTO.getT10_ContractId() ) );


        int requestPageNumber = contractRequestDTO.getH02_requestPageNumber();
        int currentRow = requestPageNumber * ONE_PAGE_ROW; //Didn't understand .

        daoPrm.setOffset( currentRow );
        // 出力件数
        daoPrm.setOutputRow( ONE_PAGE_ROW );

        //daoPrm.setUserId( (String)request.getSession().getAttribute( CommonItemName.USER_ID ) );
        daoPrm.setUserId( CommonItemName.USER_ID  );


        S01S2002Dao s01S2002Dao = mapper.S01S2002(daoPrm);




    }




    /**
     * "%" で囲った文字列を返す.
     * @param arg 編集元文字列
     * @return 編集後文字列
     */
    private String toLikeString( String arg ){

        String value = null;
        if( arg == null || ( value = arg.trim() ).isEmpty() ){
            return CommonConstant.BLANK;
        }

        return "%" + value + "%";
    }

    /**
     * ハイフン除去.
     * @param arg 編集元値
     * @return 編集後値
     */
    private String removeHyphen( String arg ){
        String value = null;
        if( arg == null || ( value = arg.trim() ).isEmpty() ){
            return CommonConstant.BLANK;
        }
        return value.replaceAll( "-", "" );
    }

    /**
     * 日付文字列 ハイフン編集.
     * @param arg 編集元値
     * @return 編集後値
     */
    private String editDateString( String arg ){
        String value = null;
        if( arg == null || ( value = arg.trim() ).isEmpty() ){
            return CommonConstant.BLANK;
        }else if( value.length() != 8 ){
            return value;
        }

        return value.substring( 0, 4 ) + "-" + value.substring( 4, 6 ) + "-" + value.substring( 6, 8 );
    }

    /**
     * "%" をエスケープする.
     * @param arg 編集元文字列
     * @return 編集後文字列
     */
    private String escapePercent( String arg ){

        String value = null;
        if( arg == null || ( value = arg.trim() ).isEmpty() ){
            return CommonConstant.BLANK;
        }

        return value.replaceAll( "%", "\\\\%" );
    }




    /** ModuleId S01:C-premix */
    private static final String MODULE_ID = "S1";



    /** 出力件数 */
//    private static final int ONE_PAGE_ROW = Integer
//            .parseInt( CommonApp.getOutputConstantId( CommonItemName.S01C0001 ) );
    private static final int ONE_PAGE_ROW = 50;
    /** ページ番号表示長 */
    private static final int PAGE_NUMBER_LENGTH = 5;




}
