package com.intern.project.repos;

import com.intern.project.entities.GeneralStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGeneralStatusRepository extends JpaRepository<GeneralStatusEntity,Integer>{
}
