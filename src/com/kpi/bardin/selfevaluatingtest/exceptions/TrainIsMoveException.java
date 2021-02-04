package com.kpi.bardin.selfevaluatingtest.exceptions;

public class TrainIsMoveException extends Exception {
    public TrainIsMoveException() {
    }

    public TrainIsMoveException(String message) {
        super(message);
    }

    public TrainIsMoveException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrainIsMoveException(Throwable cause) {
        super(cause);
    }

    public TrainIsMoveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
