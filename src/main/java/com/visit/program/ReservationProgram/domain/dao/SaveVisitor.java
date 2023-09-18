package com.visit.program.ReservationProgram.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.beans.PropertyEditorSupport;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * visitor 테이블을 저장하기 위한 클래스
 */
@Getter
@Setter
@NoArgsConstructor
public class SaveVisitor {

    @NotEmpty
    private String employee_name;   //접견자 이름
    @NotEmpty
    private String name;    //방문자 이름
    @Pattern(regexp = "^([0-9]{1,20})$")
    @NotEmpty
    private String phone_number;    //연락처
    private String company; //소속회사
    @NotEmpty
    private String visit_date1; //방문일자(FROM)
    @NotEmpty
    private String visit_date2; //방문일자(TO)
    private String withPerson;  //동행자
    @NotEmpty
    private String purpose; //방문 목적
    @NotEmpty
    private String loginId; //접견자의 그룹웨어 아이디
    @NotEmpty
    private String password;    //해당 게시글의 임시 비밀번호
    @NotEmpty
    private String passwordCheck;   //임시 지정한 비밀번호 확인용

    private String write_date;  //작성일
    private int count;  //수정 횟수
    private String revised_write_date;  //수정일자
    private Boolean is_checked; //방문여부

    public SaveVisitor(String loginId, String password, String passwordCheck, String employee_name, String name, String phone_number, String company, String visit_date1, String visit_date2, String withPerson, String purpose) {
        this.loginId = loginId;
        this.password = password;
        this.passwordCheck = passwordCheck;
        this.employee_name = employee_name;
        this.name = name;
        this.phone_number = phone_number;
        this.company = company;
        this.visit_date1 = visit_date1;
        this.visit_date2 = visit_date2;
        this.withPerson = withPerson;
        this.purpose = purpose;
        this.count = 0;
        this.is_checked = false;
        this.revised_write_date = null;
    }
}
