package com.vitor.mongoproject.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

    private static final long SerialVersionUID = 1L;

    private Long timestamp;
    private Integer status;
    private String error;
    private String path;
    private String message;

    public StandardError() {
        super();
    }

    public StandardError(Long timestamp, Integer status, String error, String path, String message) {
        this.message = message;
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

}

/*
 * 
 * "timestamp": "2024-05-26T22:52:15.767+00:00",
 * "status": 500,
 * "error": "Internal Server Error",
 * "path": "/users/6653ba82c220cc5d9c3ddfb7ssss"
 */