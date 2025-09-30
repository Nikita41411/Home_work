package edu.praktikum.sprint3.exceptions;

public class CustomException extends RuntimeException {

    public CustomException() {
        super("String is empty");
    }
}
