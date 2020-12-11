package com.jpaspringdata.repository;

import com.jpaspringdata.domain.Spittle;

import java.util.List;

/**
 *
 */
public interface SpittleRepositoryCustom {

    List<Spittle> findRecent();

    List<Spittle> findRecent(int count);

}
