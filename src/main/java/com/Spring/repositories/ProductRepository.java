package com.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Spring.models.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>
{	
}


