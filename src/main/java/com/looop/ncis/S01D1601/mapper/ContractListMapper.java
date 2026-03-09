package com.looop.ncis.S01D1601.mapper;

import com.looop.ncis.S01D1601.dao.S01S2002Dao;
import com.looop.ncis.S01D1601.dao.S01S2002PrmDao;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ContractListMapper {




     S01S2002Dao S01S2002(S01S2002PrmDao daoPrm);

}
