package com.ypatel.ecommerceProj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ypatel.ecommerceProj.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
