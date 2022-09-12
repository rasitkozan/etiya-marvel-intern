package com.intern.project.repos;

import com.intern.project.entities.CustomerOrderCharValEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerOrderCharValRepository extends JpaRepository<CustomerOrderCharValEntity,Integer> {
}
