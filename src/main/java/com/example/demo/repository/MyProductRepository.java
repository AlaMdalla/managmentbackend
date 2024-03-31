package com.example.demo.repository;

import com.example.demo.entity.MyProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyProductRepository extends JpaRepository<MyProduct,Integer>{
  List<MyProduct>  findByName(String name);

}
