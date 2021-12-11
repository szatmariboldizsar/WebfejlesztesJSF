package com.jsf.spring.repository;

import com.jsf.spring.entity.Shoe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Long> {

	Shoe findShoeByShoeId(Long shoeId);
}