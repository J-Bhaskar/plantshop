
package com.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.models.Cart_item;


@Repository
public interface Cart_item_Repository extends JpaRepository<Cart_item,Integer>
{}

