package cn.albers.knight.config;

import cn.albers.knight.BraveKnight;
import cn.albers.knight.Knight;
import cn.albers.knight.SlayDragonQuest;
import cn.albers.knight.Quest;
import  cn.albers.knight.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/10/19
 * @description:
 */
@Configuration
@ComponentScan("cn.albers.knight")
@EnableAspectJAutoProxy
public class KnightConfig {

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Knight knight(Quest quest) {
        return new BraveKnight(quest);
    }
}
