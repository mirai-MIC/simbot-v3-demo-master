package org.simbot;


import love.forte.simboot.spring.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.mrxiaom.qsign.QSignService;

import java.io.File;

@EnableSimbot
@SpringBootApplication
public class simBotApp {
    public static void main(String... args) {
        // 修复协议版本
        QSignService.Factory.init(new File("txlib/8.9.68"));
        QSignService.Factory.loadProtocols(null);
        QSignService.Factory.register();

        SpringApplication.run(simBotApp.class,args);
    }
}