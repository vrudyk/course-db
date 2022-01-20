package com.solvd.util.enums;

import java.util.Arrays;
import java.util.Optional;

public enum Acreditation {
    FIRST("1"),
    SECOND("2"),
    THIRD("3"),
    FOURTH("4");

    private final String value;

    Acreditation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Acreditation getValue(String value) {
        switch (value) {
            case "1":
                return Acreditation.FIRST;
            case "2":
                return Acreditation.SECOND;
            case "3":
                return Acreditation.THIRD;
            case "4":
                return Acreditation.FOURTH;
        }
        return null;
    }
}
