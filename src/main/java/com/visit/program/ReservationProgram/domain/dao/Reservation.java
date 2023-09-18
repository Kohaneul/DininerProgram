package com.visit.program.ReservationProgram.domain.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 예약 정보 관련 클래스 (방문자 전체 조회시 사용)
 */
@Getter
@Setter
@NoArgsConstructor
public class Reservation {
    private Long id;    //방문내역 게시글에 대한 id 값
    private Long visitor_id;    //방문자 게시글에 대한 id(foreign key visitor)
    private Long employee_id;   //작성 직원에 대한 id(foreign key employee)
    private String name;    //방문자 이름
    private String employee_name;   //직원 이름
    private String visit_Date1; //방문일자 1(from)
    private String visit_Date2; //방문일자 2(to)
    private String phone_number;    //연락처
    private String withPerson;  //동행자
    private String purpose; //목적
    private String company; //방문자의 소속 회사
    private Boolean is_checked; //방문여부

    public Reservation(Long id, String name, String employee_name, String visit_Date1, String visit_Date2, String phone_number, String withPerson, String company, Boolean is_checked, Long visitor_id
            , Long employee_id, String purpose) {
        this.id = id;
        this.name = name;
        this.employee_name = employee_name;
        this.visit_Date1 = visit_Date1;
        this.visit_Date2 = visit_Date2;
        this.phone_number = phone_number;
        this.withPerson = withPerson;
        this.company = company;
        this.is_checked = is_checked;
        this.visitor_id = visitor_id;
        this.employee_id = employee_id;
        this.purpose = purpose;
    }


}
