package com.ohgiraffers.chap01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Value("${test.value}")
    public String testValue; // application.properties(설정)에 있는 test.value값 대입?됨.

    @Value("${test.age}")
    public String testAge;

    /* 설명. @Value는 시스템 환경변수도 불러올 수 있다. */
    /* 시스템의 os 등을 볼 수있음.*/
    @Value("${username}")
    public String userName;

    @Bean // 설정값을 읽어와서 찍어냄
    public Object properReadTest() {
        System.out.println("testValue = " + testValue);
        System.out.println("userName = " + userName);

        return new Object(); // 빈이 된 객체 반환.
    }
}
