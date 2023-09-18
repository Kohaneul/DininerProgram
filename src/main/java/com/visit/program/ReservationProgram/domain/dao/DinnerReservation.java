package com.visit.program.ReservationProgram.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 석식 예약 정보 관련 클래스
 */
@Getter
@Setter
@AllArgsConstructor
public class DinnerReservation {
    //dinner_reservation
    private Long id;   //pk : 아이디
    private String loginId; // 로그인 아이디
    private String part_name;   //부서명
    private String employee_name;   //근로자 이름
    private String phone_number;    //휴대폰번호
    private String visit_date;  //예약 일정
    private String contents;    //내용
    private Integer qty;    //인원 수
    private String password;    //해당 게시글에 대한 수정/삭제를 위한 비밀번호
    private String write_date;  //작성일
    private String revised_write_date;  //수정일
    private Boolean is_checked; //접수 여부
    private String checked_date;    //접수 일자

    public DinnerReservation(String loginId, String part_name, String employee_name, String phone_number, String visit_date, String contents, Integer qty, String password, String write_date, String revised_write_date, Boolean is_checked, String checked_date) {
        this.loginId = loginId;
        this.part_name = part_name;
        this.employee_name = employee_name;
        this.phone_number = phone_number;
        this.visit_date = visit_date;
        this.contents = contents;
        this.qty = qty;
        this.password = password;
        this.write_date = write_date;
        this.revised_write_date = revised_write_date;
        this.is_checked = is_checked;
        this.checked_date = checked_date;
    }
}
