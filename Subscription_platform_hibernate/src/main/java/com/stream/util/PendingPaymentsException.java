package com.stream.util;

public class PendingPaymentsException extends RuntimeException {

    public PendingPaymentsException() {
        super("Pending or Failed Payments. Please resolve payments before proceeding.");
    }

    public PendingPaymentsException(String message) {
        super(message);
    }

    public PendingPaymentsException(String message, Throwable cause) {
        super(message, cause);
    }
}
