package com.joaoguilhermmy.finance.services.exception;

public class ResourceNotFoundExcpetion extends RuntimeException {
    public ResourceNotFoundExcpetion(Object id) {
        super("Resource not found id: " + id);
    }
}
