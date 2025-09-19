package com.lifeiscoolella.restservice.repository;

import com.lifeiscoolella.restservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
