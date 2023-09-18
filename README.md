# 석식예약프로그램

### 프로젝트 목적
- 석식 예약 사전 접수로 원활한 식사 준비 (요청 부서 : 인사총무팀)
- 예약 목록 DB 관리 → 차후 업체 정산시 근거자료 활용

### 대상 : 석식 이용을 희망하는 전 직원

### PROCESS 
![image](https://github.com/Kohaneul/DininerProgram/assets/96707563/5677229d-afcf-4868-8232-1b01f53b3786)

### 개발 환경
`Java11, SpringBoot, Gradle, AJAX, MySQL, JavaScript, MyBatis, HTML, CSS, Thymeleaf, LINUX CENTOS 7`


### 사용방법  

#### `0. 전제조건`
- 일자별 허용가능 인원 지정 (DEFAULT 200명이나 사전 식수준비에 지장이 있을시 관리자가 일자별 접수 가능 인원 정하는 방식)
- 식수 사전 파악을 위하여 전날 오후 12시까지 예약 필수
- 위 두가지 중 한가지 이상 충시 해당 일자 예약 불가(링크 생성 X, 예약가능 인원 0 명으로 뜸)
- 미접수 건에 대하여 수정/ 삭제 가능하나, 기 접수건에 대하여 수정/삭제 불가함(관리자 권한을 가진 사람만 가능)
  
#### `1. 직원용`
- 입력 : 석식 희망 일자 사전 입력
- 조회 : 상세조회, 일자별 내역 조회 , 이름 조회
- 수정/삭제 : 예약 정보 수정/ 삭제

#### `2. ADMIN`
- 예약건에 대하여 접수
- 일자별 식수 인원 셋팅
  
### PORTFOLIO

[석식예약프로그램.pdf](https://github.com/Kohaneul/DinnerProgram/files/11937587/default.pdf)


****
