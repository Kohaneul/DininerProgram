package com.visit.program.ReservationProgram.domain.dao;

import lombok.*;

/**
 * 일자당 등록 가능 인원 수 셋팅
 */
@Getter
@Setter
@AllArgsConstructor
public class DateOfQty {
    private int id; //아이디
    private String now_date;    //일자
    private int qty;    //셋팅된 인원수
}
