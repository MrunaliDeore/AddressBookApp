package com.example.adressbookapp.dto;

public class ResponseDTO {

    private String message;
    private Object data;

    //generate constructor
    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    //generate getter and setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
