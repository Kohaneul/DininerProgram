package com.visit.program.ReservationProgram.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 석식 조회 내역 저장 form
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaveDinnerInfo {
    private Long employee_id;   //직원 테이블 아이디 값
    private Long dinner_reservation_id; //석식 예약 게시글 id


}
