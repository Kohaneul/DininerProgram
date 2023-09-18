package com.visit.program.ReservationProgram.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * reservation_info 매핑 클래스
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationInfo {
    private Long id;    //해당 내역에 대한 아이디
    private Long visitor_id;    //방문내역 게시글에 대한 id
    private Long employee_id;   //작성자(직원)에 대한 id
    private Boolean is_checked; //방문 여부

}