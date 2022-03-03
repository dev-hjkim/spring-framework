package com.example.springframework.databind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class DatabindRunner implements ApplicationRunner {

    @Autowired
    ConversionService conversionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(conversionService);
        // 기본 등록된 converter 정보들 출력

        System.out.println(conversionService.getClass().toString());
        // WebConversionService
        // DefaultFormatting ConversionService 상속, WebConversionService보다 많은 기능 제공
    }
}
