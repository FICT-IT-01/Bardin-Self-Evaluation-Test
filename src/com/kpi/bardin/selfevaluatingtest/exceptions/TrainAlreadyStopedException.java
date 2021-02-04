package com.kpi.bardin.selfevaluatingtest.exceptions;

public class TrainAlreadyStopedException extends Exception {
    public TrainAlreadyStopedException() {
    }

    public TrainAlreadyStopedException(String message) {
        super(message);
    }

    public TrainAlreadyStopedException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrainAlreadyStopedException(Throwable cause) {
        super(cause);
    }

    public TrainAlreadyStopedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
