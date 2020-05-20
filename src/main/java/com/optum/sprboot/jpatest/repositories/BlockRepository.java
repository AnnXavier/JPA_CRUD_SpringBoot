package com.optum.sprboot.jpatest.repositories;

import com.optum.sprboot.jpatest.models.Block;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockRepository extends JpaRepository<Block, Integer> {
}
