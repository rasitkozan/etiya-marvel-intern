package com.intern.project.repos;

import com.intern.project.dtos.GeneralStatusDto;
import com.intern.project.entities.GeneralStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IGeneralStatusRepository extends JpaRepository<GeneralStatusEntity,Integer>{
    Optional<GeneralStatusEntity> getByShortCodeAndEntityCodeName(String shortCode,String entCodeName);
}
