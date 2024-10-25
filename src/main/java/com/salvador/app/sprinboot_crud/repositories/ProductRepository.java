package com.salvador.app.sprinboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.salvador.app.sprinboot_crud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
