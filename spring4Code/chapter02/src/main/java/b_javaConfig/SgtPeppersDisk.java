package b_javaConfig;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class SgtPeppersDisk implements CompactDisk {


    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("通过b_javaConfig显示：Playing " + title + " by " + artist);
    }

}
