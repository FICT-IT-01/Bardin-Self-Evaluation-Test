package com.kpi.bardin.selfevaluatingtest.exceptions;

public class ToLowSpeedException extends Exception {
    public ToLowSpeedException() {
    }

    public ToLowSpeedException(String message) {
        super(message);
    }

    public ToLowSpeedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ToLowSpeedException(Throwable cause) {
        super(cause);
    }

    public ToLowSpeedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
