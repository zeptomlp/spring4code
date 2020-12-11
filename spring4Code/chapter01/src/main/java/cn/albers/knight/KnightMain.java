package cn.albers.knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/10/19
 * @description:
 */
public class KnightMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
