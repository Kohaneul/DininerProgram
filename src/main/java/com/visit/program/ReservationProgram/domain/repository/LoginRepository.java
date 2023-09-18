package com.visit.program.ReservationProgram.domain.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 해당 게시글에 대한 작성자 조회 및 확인하기 위한 로그인 클래스
 * 대상 테이블 : employee,visitor,dinner_reservation
 * MAPPER 설정 파일 : login_mapper.xml
 */


@Mapper
@Repository
public interface LoginRepository {
    Long loginMember(@Param("loginId") String loginId, @Param("password") String password, @Param("id") Long id);

    Long loginEmp(@Param("loginId") String loginId, @Param("password") String password, @Param("id") Long id);

    Boolean loginAdmin(@Param("loginId") String loginId, @Param("password") String password, @Param("id") Long id);
}
