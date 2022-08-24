package com.intern.project.repos;

import com.intern.project.entities.CustomerOrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerOrderItemRepository extends JpaRepository<CustomerOrderItemEntity,Integer> {
}
