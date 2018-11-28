package com.example.petstore.exception;

public class UserDoNotHaveEnoughFundsException extends PetStoreException {
    public UserDoNotHaveEnoughFundsException(String message) {
        super(message);
    }
}
