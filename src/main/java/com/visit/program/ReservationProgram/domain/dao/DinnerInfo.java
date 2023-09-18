package com.visit.program.ReservationProgram.domain.dao;

import lombok.Getter;
import lombok.Setter;

/**
 * 석식 예약 정보
 */
@Getter
@Setter
public class DinnerInfo {
    private Long id;    //아이디
    private Long employee_id;   //employee 테이블 id 참조
    private Long dinner_reservation_id;//dinner_reservation 테이블의 id 참조


    public DinnerInfo(Long employee_id, Long dinner_reservation_id) {
        this.employee_id = employee_id;
        this.dinner_reservation_id = dinner_reservation_id;
    }
}
