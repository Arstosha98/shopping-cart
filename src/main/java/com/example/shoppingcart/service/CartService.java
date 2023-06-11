package com.example.shoppingcart.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class CartService {

    private final List<Integer> storage = new ArrayList<>();

    public void add(List<Integer>ids){
        storage.addAll(ids);
    }

    public List<Integer> get(){
        return Collections.unmodifiableList(storage);
    }
}