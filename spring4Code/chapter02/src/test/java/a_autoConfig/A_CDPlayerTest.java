package a_autoConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class A_CDPlayerTest {

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void playCD(){
        mediaPlayer.play();
    }
}
