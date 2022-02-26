package com.example.springframework.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class I18nRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        while (true) {
            System.out.println(messageSource.getMessage("greeting", new String[]{"hjkim"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"hjkim"}, Locale.getDefault()));
            Thread.sleep(1000);
//        }

    }
}
