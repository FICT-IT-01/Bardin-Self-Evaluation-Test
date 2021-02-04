package com.kpi.bardin.selfevaluatingtest.exceptions;

public class SpeedIsToHighException extends Exception {
    public SpeedIsToHighException() {
    }

    public SpeedIsToHighException(String message) {
        super(message);
    }

    public SpeedIsToHighException(String message, Throwable cause) {
        super(message, cause);
    }

    public SpeedIsToHighException(Throwable cause) {
        super(cause);
    }

    public SpeedIsToHighException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
