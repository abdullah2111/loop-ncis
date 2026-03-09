package com.looop.ncis.utility;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public  class GetBusinessDate {
    private final JdbcTemplate jdbcTemplate;

    public Integer getOperationDate() {
        String sql = """
                SELECT OPE_DATE
                FROM M_OPE_DATE_MANAGE
                WHERE ope_date_class = ?
                OFFSET 0 LIMIT 1
                """;

        return jdbcTemplate.queryForObject(sql, Integer.class, "1");
    }


}
