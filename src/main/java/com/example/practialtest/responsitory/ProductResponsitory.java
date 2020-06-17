package com.example.practialtest.responsitory;

import com.example.practialtest.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductResponsitory extends CrudRepository<Product, Long> {
}
