package com.example.studyspring;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;
import java.util.Arrays;

public class BannerImpl implements Banner {

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        //如何格式化输出参考 https://www.cnblogs.com/abdm-989/p/11360426.html
        out.format("environment:%s", Arrays.toString(environment.getActiveProfiles()));
        out.format("sourceClass:%s", sourceClass.toString());

    }
}
