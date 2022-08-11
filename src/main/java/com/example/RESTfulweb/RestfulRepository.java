package com.example.RESTfulweb;

public class RestfulRepository {

    private final long id;
    private final String message;

    public RestfulRepository(String message) {
        this.id = 0;
        this.message = message;
    }

    public RestfulRepository(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}