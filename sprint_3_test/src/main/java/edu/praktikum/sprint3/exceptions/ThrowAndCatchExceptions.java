package edu.praktikum.sprint3.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowAndCatchExceptions {

    public static void main(String[] args) {
        stringToInt("bibi");
        readData();
        stringMustNotBeEmpty("");
        stringMustNotBeEmptyCustom("");
    }

    public static int stringToInt(String string) {
        return Integer.parseInt(string);
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String stringMustNotBeEmpty(String string) {
        if (string == null || string.isEmpty()) {
            throw new RuntimeException("String is empty");
        }
        return string;
    }

    public static String stringMustNotBeEmptyCustom(String string) {
        if (string == null || string.isEmpty()) {
            throw new CustomException();
        }
        return string;
    }
}
