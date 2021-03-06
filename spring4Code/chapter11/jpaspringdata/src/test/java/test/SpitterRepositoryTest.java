package test;

import com.jpaspringdata.config.SpringDataConfig;
import com.jpaspringdata.domain.Spitter;
import com.jpaspringdata.repository.SpitterRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringDataConfig.class)
public class SpitterRepositoryTest {

    @Autowired
    private SpitterRepository spitterRepository;

    @Test
    @Transactional
    public void countTest() {
        log.info("spitter's count : {}", spitterRepository.count());
    }

    @Test
    @Transactional
    public void saveTest() {
        log.info("spitter's count : {}", spitterRepository.count());
        Spitter spitter = new Spitter("newbee", "letmein", "New Bee",
                "newbee@habuma.com", "Y", "Elite");
        Spitter saved = spitterRepository.save(spitter);
        log.info("spitter's count : {}", spitterRepository.count());
        log.info("spitter: [" +
                        " id: {}," +
                        " username: {}," +
                        " password: {}," +
                        " fullName: {}," +
                        " email: {}," +
                        " updateByEmail: {}," +
                        " status: {}]",
                saved.getId(), saved.getUsername(), saved.getPassword(),
                saved.getFullname(), saved.getEmail(), saved.getUpdateByEmail(), saved.getStatus());
    }

    @Test
    @Transactional
    public void findByIdTest() {
        Spitter spitter = spitterRepository.findById(3);
        log.info("spitter: [" +
                        " id: {}," +
                        " username: {}," +
                        " password: {}," +
                        " fullName: {}," +
                        " email: {}," +
                        " updateByEmail: {}" +
                        " status: {}]",
                spitter.getId(), spitter.getUsername(), spitter.getPassword(),
                spitter.getFullname(), spitter.getEmail(), spitter.getUpdateByEmail(), spitter.getStatus());
    }

    @Test
    @Transactional
    public void findByUsernameTest() {
        Spitter spitter = spitterRepository.findByUsername("habuma");
        log.info("spitter: [" +
                        " id: {}," +
                        " username: {}," +
                        " password: {}," +
                        " fullName: {}," +
                        " email: {}," +
                        " updateByEmail: {}" +
                        " status: {}]",
                spitter.getId(), spitter.getUsername(), spitter.getPassword(),
                spitter.getFullname(), spitter.getEmail(), spitter.getUpdateByEmail(), spitter.getStatus());
    }

    @Test
    @Transactional
    public void findAllTest() {
        List<Spitter> spitterList = spitterRepository.findAll();
        for (Spitter spitter : spitterList) {
            log.info("spitter: [" +
                            " id: {}," +
                            " username: {}," +
                            " password: {}," +
                            " fullName: {}," +
                            " email: {}," +
                            " updateByEmail: {}" +
                            " status: {}]",
                    spitter.getId(), spitter.getUsername(), spitter.getPassword(),
                    spitter.getFullname(), spitter.getEmail(), spitter.getUpdateByEmail(), spitter.getStatus());
        }
    }

    @Test
    @Transactional
    public void eliteSweepTest(){
        log.info("update num : {}",spitterRepository.eliteSweep());
    }

}
