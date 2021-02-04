package com.kpi.bardin.selfevaluatingtest.exceptions;

public class NotEnoughPassengersException extends Exception {
    public NotEnoughPassengersException() {
    }

    public NotEnoughPassengersException(String message) {
        super(message);
    }

    public NotEnoughPassengersException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughPassengersException(Throwable cause) {
        super(cause);
    }

    public NotEnoughPassengersException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
