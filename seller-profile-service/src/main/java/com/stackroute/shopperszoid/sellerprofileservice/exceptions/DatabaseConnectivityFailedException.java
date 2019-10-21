package com.stackroute.shopperszoid.sellerprofileservice.exceptions;

public class DatabaseConnectivityFailedException extends Exception {
    private String message;

    public DatabaseConnectivityFailedException() {
    }

    public DatabaseConnectivityFailedException(String message) {
        this.message = message;
    }
}
