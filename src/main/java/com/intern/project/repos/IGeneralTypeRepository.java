package com.intern.project.repos;

import com.intern.project.entities.GeneralStatusEntity;
import com.intern.project.entities.GeneralTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface IGeneralTypeRepository extends JpaRepository<GeneralTypeEntity,Integer> {
    GeneralTypeEntity getByShortCode(String shortCode);
}
