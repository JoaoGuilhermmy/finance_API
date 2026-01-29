package com.joaoguilhermmy.finance.services.exception;

public class ResourceNotFoundExcepetion extends RuntimeException {
    public ResourceNotFoundExcepetion(Object id) {
        super("Resource not found id: " + id);
    }
}
