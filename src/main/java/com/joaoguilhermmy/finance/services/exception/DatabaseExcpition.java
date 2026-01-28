package com.joaoguilhermmy.finance.services.exception;

public class DatabaseExcpition extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DatabaseExcpition(String msg) {
        super(msg);
    }
}
