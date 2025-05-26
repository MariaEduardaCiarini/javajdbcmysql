package com.cursojava.jpawebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.jpawebservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
