package com.itonglian.fms.service.common.exception;

public class FileHandlerException extends Exception {

    public FileHandlerException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileHandlerException() {
        super();
    }

    public FileHandlerException(String message) {
        super(message);
    }
}
