package com.stackroute.shopperszoid.sellerprofileservice.exceptions;

public class SellerAlreadyExistsException extends Exception {
    private String message;

    public SellerAlreadyExistsException() {
    }

    public SellerAlreadyExistsException(String message) {
        this.message = message;
    }
}
