package com.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.models.Order_item;


@Repository
public interface Order_itemRepository extends JpaRepository<Order_item,Integer>
{}


