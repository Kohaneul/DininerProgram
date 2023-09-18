package com.visit.program.ReservationProgram.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * employee 테이블과 매핑되는 클래스
 */
@Getter
@NoArgsConstructor
public class Employee {
    private Long id;    //아이디
    private String loginId; //로그인아이디(그룹웨어 아이디)
    private String part_name;   //부서명
    private Boolean is_admin;   //관리자 여부
    private String employee_name;   //이름
    private String password;    //비밀번호
    private String phone_number; //연락처

    public Employee(String loginId, String part_name, Boolean is_admin, String employee_name, String password, String phone_number) {
        this.loginId = loginId;
        this.part_name = part_name;
        this.is_admin = is_admin;
        this.employee_name = employee_name;
        this.password = password;
        this.phone_number = phone_number;
    }
}
