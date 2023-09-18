package com.visit.program.ReservationProgram.web.controller;

import com.visit.program.ReservationProgram.domain.dao.Employee;
import com.visit.program.ReservationProgram.domain.dao.EmployeeToAdmin;
import com.visit.program.ReservationProgram.domain.dao.SaveEmployee;
import com.visit.program.ReservationProgram.domain.dao.session.SessionConst;
import com.visit.program.ReservationProgram.domain.dto.UpdateEmployeeDTO;
import com.visit.program.ReservationProgram.domain.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

/**
 * 직원 정보 관련 Controller 클래스
 * Repository -> Service -> *Controller
 */
@Controller
@Slf4j
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("reservation/employee/home")
    public String homePage(HttpSession session) {
        if (session.getAttribute(SessionConst.DINNER_PROGRAM) != null) {
            return "redirect:/dinner/info/all";
        }
        return "redirect:/reservation/info/all";
    }


    @GetMapping("/reservation/employee/save")
    public String saveEmployee(@ModelAttribute("employee") SaveEmployee employee) {
        return "employee/SaveForm";
    }


    @PostMapping("/reservation/employee/send")
    @ResponseBody
    public HashMap<String, Object> send(@RequestBody HashMap<String, Object> sendDTO) {
        String loginId = String.valueOf(sendDTO.get("loginId"));
        Employee employee = employeeService.findByLoginId(loginId);
        sendDTO.replace("loginId", employee.getLoginId());
        return sendDTO;
    }

    @PostMapping("/reservation/employee/save")
    public String saveEmployee(@Valid @ModelAttribute("employee") SaveEmployee employee, BindingResult bindingResult, HttpSession session) {
        if (bindingResult.hasErrors()) {
            return "employee/SaveForm";
        }
        employeeService.saveEmployee(employee);
        if (session.getAttribute(SessionConst.DINNER_PROGRAM) != null) {
            return "redirect:/dinner/info/dateOfQty";
        }
        return "redirect:/reservation/info/save";
    }

    @GetMapping("/reservation/employee/setAdmin")
    public String setAdmin(@ModelAttribute("employeeDTO") UpdateEmployeeDTO updateEmployeeDTO, Model model) {
        List<EmployeeToAdmin> employees = employeeService.findAllDTO(updateEmployeeDTO);
        model.addAttribute("employees", employees);
        return "employee/EmployeeSearch";
    }

    @GetMapping("/reservation/employee/setAdmin/{id}")
    public String isAdminO(@PathVariable("id") Long id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "employee/UpdateAdmin";
    }

    @PostMapping("/dinner/info/admin/{id}")
    public String updateAdmin(@PathVariable("id") Long id) {
        employeeService.updateAdmin(id);
        return "redirect:/reservation/employee/setAdmin";
    }


}
