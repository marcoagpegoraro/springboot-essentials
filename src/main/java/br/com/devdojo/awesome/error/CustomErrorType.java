package br.com.devdojo.awesome.error;

import lombok.Getter;

public class CustomErrorType {
    @Getter
    private String errorMessage;

    public CustomErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
