package com.visit.program.ReservationProgram.domain.dao;

import lombok.*;

/**
 * 일자당 등록된 인원수
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DatePerQty {
    private Long id;    //아이디
    private String dayOfTheWeek;    //요일
    private String now_date;    //현재 일자
    private Integer real_qty;   //실제 예약인원
    private Integer qty;    //최대 예약 가능한 식수
    private Integer last_qty;   //남은 인원수

}
