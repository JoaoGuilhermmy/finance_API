package com.joaoguilhermmy.finance.services.exception;

public class DatabaseExcepition extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DatabaseExcepition(String msg) {
        super(msg);
    }
}
