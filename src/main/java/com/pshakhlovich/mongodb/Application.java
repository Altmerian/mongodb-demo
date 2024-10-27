package com.pshakhlovich.mongodb;

import io.micronaut.runtime.Micronaut;

interface Application {

    static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}