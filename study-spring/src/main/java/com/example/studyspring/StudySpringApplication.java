package com.example.studyspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudySpringApplication {

    public static void main(String[] args) {
        //SpringApplication.run(StudySpringApplication.class, args);
        SpringApplication springApplication = new SpringApplication(StudySpringApplication.class);
        //您还可以使用spring.main.banner-mode属性来确定是否必须在System.out（console）上打印横幅，发送到配置的记录器（log），或者根本不产生横幅（off）。
        springApplication.setBannerMode(Banner.Mode.OFF);//配置文件的优先于这里设置的
        springApplication.run(args);
    }

}
