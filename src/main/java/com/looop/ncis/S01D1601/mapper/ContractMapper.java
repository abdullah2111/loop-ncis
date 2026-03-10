package com.looop.ncis.S01D1601.mapper;

import com.looop.ncis.S01D1601.dto.req.ContractRequestDTO;
import com.looop.ncis.S01D1601.dto.res.ContractResponseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ContractMapper {

    List<ContractResponseDTO> S01S2003(
            @Param("req") ContractRequestDTO request,
            @Param("offset") int offset,
            @Param("size") int size
    );

    long S01S2002(@Param("req") ContractRequestDTO request);
}
