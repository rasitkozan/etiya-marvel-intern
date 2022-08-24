package com.intern.project.repos;

import com.intern.project.entities.CustomerOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerOrderRepository extends JpaRepository<CustomerOrderEntity,Integer> {
}
