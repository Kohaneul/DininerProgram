package com.visit.program.ReservationProgram.domain.dto;

import lombok.*;

/**
 * 방문일자 조회
 * VISIT_DATE1 : 방문일자 1(FROM)
 * VISIT_DATE2 : 방문일자 2(TO)
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SelectDateDTO {
    private String visit_date1;
    private String visit_date2;

}
