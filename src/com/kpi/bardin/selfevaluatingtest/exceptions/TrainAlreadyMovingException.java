package com.kpi.bardin.selfevaluatingtest.exceptions;

public class TrainAlreadyMovingException extends Exception {
    public TrainAlreadyMovingException() {
    }

    public TrainAlreadyMovingException(String message) {
        super(message);
    }

    public TrainAlreadyMovingException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrainAlreadyMovingException(Throwable cause) {
        super(cause);
    }

    public TrainAlreadyMovingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
