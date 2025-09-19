package com.lifeiscoolella.restservice.controller;

import com.lifeiscoolella.restservice.entity.Item;
import com.lifeiscoolella.restservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/rest/items")
    public List<Item> getItems(){
        List<Item> items = itemRepository.findAll();
        return items;
    }
}
