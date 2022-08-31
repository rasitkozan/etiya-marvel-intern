package com.intern.project.repos;

import com.intern.project.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserRepository extends JpaRepository<UserEntity,Integer> {
        @Query("Select u from UserEntity u " +
                "JOIN u.generalStatusEntity g " +
                "where u.userName = :userName " +
                "and u.password = :password " +
                "and g.isActive = TRUE")
        UserEntity findByUserNameAndPassword(@Param("userName") String userName,
                                             @Param("password") String password);
        List<UserEntity> findByTypeId(int typeId);
}