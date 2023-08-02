package org.simbot;


import love.forte.simboot.spring.autoconfigure.EnableSimbot;
import net.mamoe.mirai.utils.BotConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.cssxsh.mirai.tool.FixProtocolVersion;

@EnableSimbot
@SpringBootApplication
public class simBotApp {
    public static void main(String... args) {
        FixProtocolVersion.fetch(BotConfiguration.MiraiProtocol.ANDROID_PHONE,"8.9.63");
        SpringApplication.run(simBotApp.class,args);
    }
}