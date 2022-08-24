package com.intern.project.repos;

import com.intern.project.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity,Integer> {
}
