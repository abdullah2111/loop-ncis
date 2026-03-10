package com.looop.ncis.S01D3101.mapper;

import com.looop.ncis.S01D3101.dao.S01S4001Dao;
import com.looop.ncis.S01D3101.dao.S01S4001PrmDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GasBillingDestinationMapper {
    S01S4001Dao S01S4001 (S01S4001PrmDao param);

    List<S01S4001Dao> S01S4002(S01S4001PrmDao daoPrm);
}
