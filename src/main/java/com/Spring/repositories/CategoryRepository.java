package com.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Spring.models.Category;

/* @EnableJpaRepositories - enables all the crud operatiosn + paging and sorting features
 * @Repository - make current interface as a repository 
 *  where autowired features and crud operation pool get created
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>
{
	// named queries
	// to call store procedures

}
