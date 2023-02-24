package com.pe.organizacion.easynutrition.domain.users.exception;

public class SystemUserNotFoundException extends RuntimeException {
    public SystemUserNotFoundException(String message) {
        super(message);
    }
}