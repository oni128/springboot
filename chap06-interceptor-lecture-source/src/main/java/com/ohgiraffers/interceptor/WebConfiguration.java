package com.ohgiraffers.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer { //정적리소스를 인터셉터 거치치읺도록?
    private StopWatchInterceptor stopwatchInterceptor;

    @Autowired
    public WebConfiguration(StopWatchInterceptor stopwatchInterceptor) {
        this.stopwatchInterceptor = stopwatchInterceptor;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
