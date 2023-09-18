package com.visit.program.ReservationProgram.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Reservation_info 테이블을 저장하기 위한 클래스
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveReservationInfo {
    private Long visitor_id;    //방문자 게시글에 대한 id (foreign key visitor 테이블에서 id 값 참조)
    private Long employee_id;   //직원 정보를 담은 id(FOREIGN KEY EMPLOYEE 테이블에서 ID값 참조)
    private Boolean is_checked; //해당 직원을 찾아오는 방문자의 방문 여부
}
