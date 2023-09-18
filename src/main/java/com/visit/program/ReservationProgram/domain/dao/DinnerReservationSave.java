package com.visit.program.ReservationProgram.domain.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 석식 예약 게시글 등록을 위한 클래스
 */
@Getter
@Setter
@NoArgsConstructor
public class DinnerReservationSave {
    @NotEmpty
    private String loginId; //로그인아이디
    @NotEmpty
    private String employee_name;   //근로자 이름
    @NotEmpty
    private String part_name;   //소속 부서

    private String phone_number;    //연락처
    @NotEmpty
    private String password;    //게시글의 추가 수정,삭제를 위한 비밀번호
    @NotEmpty
    private String passwordCheck;   //비밀번호 확인용
    @NotEmpty
    private String visit_date;  //예약일자
    @NotNull
    @Range(min = 1)
    private Integer qty;    //인원수
    @NotEmpty
    private String contents;    //상세 내용

    public DinnerReservationSave(String loginId, String part_name, String employee_name, String phone_number, String visit_date, String contents, Integer qty, String password, String passwordCheck) {
        this.loginId = loginId;
        this.employee_name = employee_name;
        this.part_name = part_name;
        this.phone_number = phone_number;
        this.password = password;
        this.passwordCheck = passwordCheck;
        this.visit_date = visit_date;
        this.qty = qty;
        this.contents = contents;
    }
}
