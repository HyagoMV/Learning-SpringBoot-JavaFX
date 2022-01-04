package com.github.hyagomv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.hyagomv.database.entity.H2UserEntity;

@Repository
public interface H2UserRepository extends JpaRepository<H2UserEntity, Long> {

}
