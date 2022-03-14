package com.bsd.spring.model;

import java.util.Objects;

public final class ErrorResponse {
    private final String errorMessage;

    public ErrorResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String errorMessage() {
        return errorMessage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (ErrorResponse) obj;
        return Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorMessage);
    }

    @Override
    public String toString() {
        return "ErrorResponse[" +
                "errorMessage=" + errorMessage + ']';
    }


}
