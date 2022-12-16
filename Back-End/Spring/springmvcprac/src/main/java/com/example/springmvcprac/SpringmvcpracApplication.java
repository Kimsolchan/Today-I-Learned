package com.example.springmvcprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// @SpringBootApplication
// Application 클래스에 쓰는 어노테이션으로, @SpringBootApplication 으로 인해 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정된다.
// @SpringBootApplication 이 있는 위치부터 설정을 읽어가기 때문에 이 클래스는 항상 프로젝트의 최상단에 위치 해야만 한다.
// SpringApplication.run 으로 내장 WAS 를 실행해 톰캣(Tomcat)을 설치할 필요가 없게되고, 스프링 부트로 만들어진 Jar 파일로 실행하면 된다.
//게다가 SpringBoot 에서는 내장 WAS 를 권장하고 있는데, '언제 어디서나 같은 환경에서 스프링 부트를 배포'할 수 있는 이점이 있기 때문이다.
// -> 많은 기업들이 내장 WAS 를 이용하고 있다고 한다.
@SpringBootApplication
public class SpringmvcpracApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcpracApplication.class, args);
    }

}
