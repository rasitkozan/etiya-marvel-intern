package com.intern.project.repos;

import com.intern.project.dtos.GeneralStatusDto;
import com.intern.project.entities.GeneralStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IGeneralStatusRepository extends JpaRepository<GeneralStatusEntity,Integer>{
    public GeneralStatusEntity getByShortCode(@Param("shortCode") String shortCode);
}
