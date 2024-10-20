package com.pshakhlovich.mongodb.search.service;

import com.mongodb.client.MongoClient;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor
public class MongoDbSearchService {
    private final MongoClient mongoClient;

    public String search() {
        return "Search results";
    }


}
