package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        Boolean between = false;
        if (isLessThan7(valueToEvaluate) && isGreaterThan5(valueToEvaluate)) between = true;
        return between;
    }

    public Boolean startsWith(String string, Character character) {
        String characterToUpperCase = String.valueOf(character);
        return string.toUpperCase().startsWith(characterToUpperCase.toUpperCase());
    }
}
