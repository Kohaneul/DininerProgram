package com.visit.program.ReservationProgram.domain.dao;
/**
 * 석식 예약 게시글 업로드시 관리자가 접수 체크시 접수 게시글에 대하여 체크여부, 체크일자 DB에 반영되어  기록
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DinnerReservationCheckedUpdate {
    private Long id;    //아이디
    private Boolean is_checked; //체크여부
    private String checked_date;    //체크하게 되면 -> 체크일자 자동 기록

}
