package b_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisk compactDisk(){
        return new SgtPeppersDisk();
    }

    @Bean
    public MediaPlayer mediaPlayer(){
        return new CDPlayer(compactDisk());
    }
}
