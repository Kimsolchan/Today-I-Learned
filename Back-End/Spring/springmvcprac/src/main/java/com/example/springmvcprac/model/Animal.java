package com.example.springmvcprac.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Lombok 라이브러리에서 제공하는 어노테이션
// 접근자/ 설정자 자동 생성
// @Getter , @Setter : aaa라는 필드에 선언하면 자동으로 getAaa()(boolean 타입인 경우, isAaa())와 setAaa() 메소드를 생성해준다.

// 생성자 자동 생성
// @NoArgsConstructor
// 파라미터가 없는 기본 생성자를 생성해준다
// @AllArgsConstructor 어노테이션은 : 모든 필드 값을 파라미터로 받는 생성자를 만든다.
@Getter
@Setter
@AllArgsConstructor
public class Animal {
    // 이름(name) , 나이(age) 가 선언되어 있다.
     String name;
     int age;
}
