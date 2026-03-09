package com.looop.ncis.S01D1601.dto.res;

import com.looop.ncis.utility.CommonConstant;
import lombok.Data;

@Data
public class PagenateBean {
    /** Style class */
    private String styleClass = CommonConstant.STR_EMPTY;
    /** ページ名 */
    private String pageName = CommonConstant.STR_EMPTY;
    /** ページ数 */
    private int pageNumber;
}
