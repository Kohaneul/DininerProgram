package com.visit.program.ReservationProgram.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 직원 조회 관련 DTO
 * 조회 조건
 * EMPLOYEE_NAME : 조회할 문자열 포함하는 이름
 * PART_NAME : 부서명 포함
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeDTO {
    private String employee_name;   // 이름 조회
    private String part_name;   // 부서 조회


}
