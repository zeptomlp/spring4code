package com.jpaspringdata.repository;

import com.jpaspringdata.domain.Spittle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 */
public interface SpittleRepository extends JpaRepository<Spittle, Long>, SpittleRepositoryCustom {

    Spittle findById(long id);

    List<Spittle> findBySpitterId(long spitterId);

}
