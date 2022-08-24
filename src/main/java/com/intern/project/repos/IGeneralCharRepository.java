package com.intern.project.repos;

import com.intern.project.entities.GeneralCharEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGeneralCharRepository extends JpaRepository<GeneralCharEntity,Integer> {
}
