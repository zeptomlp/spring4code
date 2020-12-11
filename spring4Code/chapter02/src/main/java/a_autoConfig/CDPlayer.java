package a_autoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/12/11
 * @description:
 */
@Component
public class CDPlayer implements MediaPlayer {

    @Autowired
    private CompactDisk cd;

    @Override
    public void play() {
        cd.play();
    }

}
