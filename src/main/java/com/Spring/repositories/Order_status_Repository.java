package com.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.models.Order_status;


@Repository
public interface Order_status_Repository extends JpaRepository<Order_status,String>
{}

