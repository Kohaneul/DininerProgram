package com.visit.program.ReservationProgram.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class EmployeeToAdmin {
    private Long id;
    private String loginId;
    private String password;
    private String employee_name;
    private String part_name;
    private Boolean is_admin;


}
