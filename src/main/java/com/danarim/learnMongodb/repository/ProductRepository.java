package com.danarim.learnMongodb.repository;

import com.danarim.learnMongodb.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    List<Product> getProductsByName(String name);
}
