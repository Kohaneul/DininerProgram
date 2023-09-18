package com.visit.program.ReservationProgram.domain.service;

import com.visit.program.ReservationProgram.domain.dao.Employee;
import com.visit.program.ReservationProgram.domain.dao.EmployeeToAdmin;
import com.visit.program.ReservationProgram.domain.dao.SaveEmployee;
import com.visit.program.ReservationProgram.domain.dto.Login;
import com.visit.program.ReservationProgram.domain.dto.UpdateEmployeeDTO;
import com.visit.program.ReservationProgram.domain.repository.EmployeeRepository;
import com.visit.program.ReservationProgram.domain.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 직원 정보 저장, 조회 하는 Service 클래스
 * Repository -> *Service -> Controller
 */
@Service
@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Transactional
    public void saveEmployee(SaveEmployee saveEmployee) {
        employeeRepository.saveEmployee(new Employee(saveEmployee.getLoginId(), saveEmployee.getPart_name(), null, saveEmployee.getEmployee_name(), null, saveEmployee.getPhone_number()));
    }

    public List<EmployeeToAdmin> findAllDTO(UpdateEmployeeDTO employeeDTO) {
        return employeeRepository.findAllDTO(employeeDTO);
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee findByLoginId(String loginId) {
        return employeeRepository.findByLoginId(loginId);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public String findByName(Long id) {
        return employeeRepository.findByName(id);
    }

    @Transactional
    public void updatePassword(String password, Long id) {
        employeeRepository.updatePassword(password, id);
    }

    @Transactional
    public void updateAdmin(Long id) {
        employeeRepository.updateAdmin(id);
    }


}
