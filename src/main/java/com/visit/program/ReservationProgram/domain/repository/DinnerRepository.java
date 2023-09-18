package com.visit.program.ReservationProgram.domain.repository;

import com.visit.program.ReservationProgram.domain.dao.*;
import com.visit.program.ReservationProgram.domain.dto.DinnerInfoDTO;
import com.visit.program.ReservationProgram.domain.dto.SelectDateDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 석식 예약 내역 관련 매핑 클래스
 * 대상 테이블 : dinner_reservation
 * MAPPER 설정 파일 : dinner_mapper.xml
 */
@Mapper
@Repository
public interface DinnerRepository {
    void saveReservation(DinnerReservation reservation);

    void updateDateOfQty(UpdateDateOfQty updateDateOfQty);

    void updateInfo(DinnerReservationUpdate dinnerReservationUpdate);

    void updateCheckedReservation(DinnerReservationCheckedUpdate update);

    void updateOfQty(@Param("id") Long id);

    void saveInfo(SaveDinnerInfo dinnerInfo);

    List<DinnerReservationInfo> findAllDTO(DinnerInfoDTO infoDTO);

    List<DinnerReservationInfo> findAll();

    List<DatePerQty> findAllDatePerQty(SelectDateDTO dateDTO);

    List<DatePerQty> findAllDatePerQtyFrom7Days();

    Integer findLastQty(@Param("now_date") String now_date);

    Integer findRealQty(@Param("now_date") String now_date);

    DateOfQty selectDateOfQty(@Param("id") Long id);

    Long findByName(@Param("employee_name") String employee_name);

    void updateAteInfo(@Param("id") Long id);

    DinnerReservation findOne(@Param("id") Long id);

    DinnerInfo findInfoOne(@Param("id") Long id);

    void deleteDinnerInfo(@Param("id") Long id);

    void deleteDinnerReservation(@Param("id") Long id);
//    Long findDinnerInfo(@Param("employee_name")String employee_name);


}

