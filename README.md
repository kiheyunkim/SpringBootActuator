# Spring Boot Actuator
감시, 지표, 감사기능을 제공하는 모듈

> 기본적으로 모든 모듈(엔드 포인트)들이 제공되지 않음.
> 
> Spring Boot 2.0.1 이후엔 해당 기능들을 오픈하기 위해서는 지정해줘야함
> 
> reference: https://stackoverflow.com/questions/35517713/unable-to-access-spring-boot-actuator-actuator-endpoint
> 
> endpoint 종류: https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.endpoints

## Endpoint 종류

### /actuator

이용 가능한 actuator 모듈에서 이용가능한 전체 모듈을 명시함

> HATEAOS를 추가해줘야한다고 하는데 안해도 된다.... 왜 일까

### audievents

### beans
spring Boot 어플리케이션 내에 모든 bean 목록을 보여줌

### caches
spring Boot 어플리케이션 내의 이용 가능한 캐시들을 노출함.

### conditions
configuration과 auto-configuration으로 평가된 클래스들의 상태와 성공/실패 이유를 알려줌

### configprops
@ConfigurationProperties로 부터 수집된 properties의 목록을 보여줌
