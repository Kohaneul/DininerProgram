package com.visit.program.ReservationProgram;

import com.visit.program.ReservationProgram.domain.interceptor.LoginInterceptor;
import com.visit.program.ReservationProgram.domain.interceptor.SessionInterceptor;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;
import java.util.Collections;

@Configuration
public class ReservationConfig implements WebMvcConfigurer {
    /*
     * 방문예약 관련 인터셉터 : 요청 경로 진입 전 조건값에 의하여 요청을 가로채어 수행하는 클래스
     *
     * */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //1. 세션 : 요청한 url에 진입하면 세션 생성됨. 그 이외의 경로로 진입시 접근 불가하도록 설정함
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/m/**", "/reservation", "/reservation/**", "/reservation/info/**", "/dinner/**").order(1).
                excludePathPatterns("/reservation/info/all/rapigen_employee", "/reservation/info/all/rapigen_security", "/dinner/info/rapigen",
                        "/dinner/info/checkInfo", "/dinner/info/confirm");
        //2. 로그인  : 등록, 수정, 삭제, 상세 조회시 반드시 로그인을 통해서 들어가야 함.
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/m/reservation/info/update/*", "/m/reservation/info/delete/*",
                "/dinner/info/update/{id}", "/reservation/info/update/{id}", "/reservation/info/delete/{id}"
        ).order(2);
    }

    @Bean
    public ServletContextInitializer clearJsession() {
        return servletContext -> {
            servletContext.setSessionTrackingModes(Collections.singleton(SessionTrackingMode.COOKIE));
            SessionCookieConfig sessionCookieConfig = servletContext.getSessionCookieConfig();
            sessionCookieConfig.setHttpOnly(true);
        };
    }


}
