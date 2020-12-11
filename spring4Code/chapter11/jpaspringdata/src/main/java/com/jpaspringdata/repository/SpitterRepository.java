package com.jpaspringdata.repository;

import com.jpaspringdata.domain.Spitter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 */
public interface SpitterRepository extends JpaRepository<Spitter, Long>, SpitterSweeper {

    Spitter findById(long id);

    Spitter findByUsername(String username);

    List<Spitter> findByUsernameOrFullnameLike(String username, String fullname);

}
