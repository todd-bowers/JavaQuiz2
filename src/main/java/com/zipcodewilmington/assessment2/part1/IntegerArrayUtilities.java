package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> rangeArrayList = new ArrayList<>();
        for (int i = start; i <= stop; i++) rangeArrayList.add(i);
        Integer[] rangeArray = new Integer[rangeArrayList.size()];
        for (int i = 0; i < rangeArrayList.size(); i++) rangeArray[i] = rangeArrayList.get(i);
        return rangeArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-2] * array[array.length-1];
    }
}
