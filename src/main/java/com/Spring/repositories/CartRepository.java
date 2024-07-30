package com.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.models.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart,Integer>
{}


