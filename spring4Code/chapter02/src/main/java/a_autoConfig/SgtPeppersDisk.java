package a_autoConfig;

import org.springframework.stereotype.Component;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/12/11
 * @description:
 */
@Component
public class SgtPeppersDisk implements CompactDisk {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("通过a_autoConfig显示：Playing " + title + " by " + artist);
    }

}
