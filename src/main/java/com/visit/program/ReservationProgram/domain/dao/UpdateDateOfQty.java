package com.visit.program.ReservationProgram.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 일자별 식수인원 수정을
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateDateOfQty {
    private Long id;    //dateOfQty 테이블을 참조하는 id값
    private Integer qty;    //인원수 (DEFAULT 200명으로 셋팅됨)
}
