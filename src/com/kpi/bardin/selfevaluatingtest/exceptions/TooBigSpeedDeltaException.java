package com.kpi.bardin.selfevaluatingtest.exceptions;

public class TooBigSpeedDeltaException extends Exception {
    public TooBigSpeedDeltaException() {
    }

    public TooBigSpeedDeltaException(String message) {
        super(message);
    }

    public TooBigSpeedDeltaException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooBigSpeedDeltaException(Throwable cause) {
        super(cause);
    }

    public TooBigSpeedDeltaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
