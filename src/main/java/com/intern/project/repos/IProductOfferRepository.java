package com.intern.project.repos;

import com.intern.project.entities.ProductOfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductOfferRepository extends JpaRepository<ProductOfferEntity,Integer> {
}
