package com.gomatch.jogae.domain;

public class Globals {
    public static int calculateDigits(int value)
    {
        int result = 1;
        if (value >= 10)
        {
            value = value / 10;
            result += Globals.calculateDigits(value);
        };
        return result;
    }
}
