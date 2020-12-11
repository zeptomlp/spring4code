package com.cache.repository;

import com.cache.domain.Spittle;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 *
 */
public interface SpittleRepositoryCustom {

    @Cacheable("spittleCache")
    List<Spittle> findRecent();

    List<Spittle> findRecent(int count);

}
