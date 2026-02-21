package com.stream.util;

public class SubscriptionAlreadyActiveException extends RuntimeException {

    public SubscriptionAlreadyActiveException() {
        super("Subscription already exists. No duplicates allowed.");
    }

    public SubscriptionAlreadyActiveException(String message) {
        super(message);
    }

    public SubscriptionAlreadyActiveException(String message, Throwable cause) {
        super(message, cause);
    }
}
