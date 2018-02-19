package com.webapp.project.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.model.Data;

@Repository
public interface DataRepository extends CrudRepository<Data,Long> {
	
	@Transactional
	@Modifying
    @Query("UPDATE Data d SET d.name = :name, d.w1 = :w1, d.x = :x, d.w2 = :w2 WHERE d.id = :id")
    int updateData(@Param("id") long id, @Param("name") String name, @Param("w1") float w1, 
    		@Param("x") float x, @Param("w2") float w2);
}
