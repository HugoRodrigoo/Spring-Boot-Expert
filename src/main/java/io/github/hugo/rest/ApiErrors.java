package io.github.hugo.rest;

import lombok.Data;
import lombok.Getter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ApiErrors {
    @Getter
    public List<String> errors;

    public ApiErrors(String messagemErro){
        this.errors = Arrays.asList(messagemErro);
    }
}
