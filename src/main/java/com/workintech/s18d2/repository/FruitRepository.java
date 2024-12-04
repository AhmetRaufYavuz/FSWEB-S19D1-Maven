package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

    @Query(value = "Select f.id, f.name, f.price,f.fruit_type From fsweb.fruit f Order by f.price DESC",nativeQuery = true)
    List<Fruit> getByPriceDesc();


    @Query(value = "Select f.id, f.name, f.price,f.fruit_type From fsweb.fruit f Order by f.price ASC",nativeQuery = true)
    List<Fruit> getByPriceAsc();

    @Query("Select f from Fruit f Where f.name LIKE %:name%")
    List<Fruit> searchByName(String name);
}