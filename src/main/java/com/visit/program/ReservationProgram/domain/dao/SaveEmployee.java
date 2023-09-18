package com.visit.program.ReservationProgram.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * 직원 정보 저장 form
 */
@AllArgsConstructor
@Getter
@Setter
public class SaveEmployee {
    @NotEmpty
    private String loginId; //직원별 그룹웨어 아이디
    @NotEmpty
    private String employee_name;   //이름
    @NotEmpty
    private String part_name;   //부서

    //    @Pattern(regexp = "^0([0-9]{1,2})([0-9]{7,8})$")
    private String phone_number;    //연락처

}

