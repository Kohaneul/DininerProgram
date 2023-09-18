package com.visit.program.ReservationProgram.domain.repository;

import com.visit.program.ReservationProgram.domain.dao.*;
import com.visit.program.ReservationProgram.domain.dto.Login;
import com.visit.program.ReservationProgram.domain.dto.UpdateEmployeeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 직원에 대한 정보를 저장
 * 대상 테이블 : employee
 * MAPPER 설정 파일 : employee_mapper.xml
 */

@Mapper
@Repository
public interface EmployeeRepository {
    void saveEmployee(Employee employee);

    List<EmployeeToAdmin> findAllDTO(UpdateEmployeeDTO employeeDTO);

    void updateAdmin(@Param("id") Long id);

    void updatePassword(@Param("password") String password, @Param("id") Long id);    //비밀번호 변경

    String findByName(@Param("id") Long id); //이름 조회

    List<Employee> findAll();   //직원 전체 조회

    Employee findById(@Param("id") Long id); //직원조회 1 : 아이디를 통한 조회

    Employee findByLoginId(String loginId); //직원조회 2 : 로그인 아이디를 통한 조회

}
