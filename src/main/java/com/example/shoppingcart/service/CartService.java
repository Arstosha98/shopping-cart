package com.example.shoppingcart.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class CartService {

    private final Set<Integer> storage = new HashSet<>();

    public void add(List<Integer> ids){
        storage.addAll(ids);
    }

    public Set get(){
        return Collections.unmodifiableSet(storage);
    }
}