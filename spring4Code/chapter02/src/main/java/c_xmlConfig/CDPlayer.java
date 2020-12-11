package c_xmlConfig;

/**
 *
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisk cd;

    public CDPlayer(CompactDisk cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

}
