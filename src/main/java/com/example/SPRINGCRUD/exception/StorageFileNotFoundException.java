package com.example.SPRINGCRUD.exception;

import com.example.SPRINGCRUD.exception.StorageException;

public class StorageFileNotFoundException  extends StorageException {

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
