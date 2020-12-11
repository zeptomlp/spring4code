package c_xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class C_CDPlayerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c_xmlConfig_spring.xml");
        MediaPlayer mediaPlayer = context.getBean(CDPlayer.class);
        mediaPlayer.play();
        context.close();
    }
}
