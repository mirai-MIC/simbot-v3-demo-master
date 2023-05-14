package org.simbot;


import love.forte.simboot.spring.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.cssxsh.mirai.tool.FixProtocolVersion;

@EnableSimbot
@SpringBootApplication
public class simBotApp {
    public static void main(String... args) {
        FixProtocolVersion.update();
        SpringApplication.run(simBotApp.class,args);
    }
}