package com.visit.program.ReservationProgram.domain.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 석식 게시글 조회 관련 DTO
 * 조회 조건
 * EMPLOYEE_NAME : 조회할 문자열 포함하는 이름
 * VISIT_DATE1, VISIT_DATE2 : 방문일자 1 or 방문일자2와 일치
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DinnerInfoDTO {
    private String employee_name;   // 이름 조회
    private String visit_date1; // 방문일자 1
    private String visit_date2; //방문일자 2


}
