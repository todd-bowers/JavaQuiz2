package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] merged = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0,merged,0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotated = new Integer[array.length];
        for (int i = 0; i < array.length - index; i++) {
            rotated[i] = array[i + index];
        }
        for (int i = index; i > 0; i--) {
            rotated[array.length - i] = array[index - i];
        }
        return rotated;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] merged = merge(array1, array2);
        Map<Integer, Integer> countMap = new HashMap<>();
        int occurrences;
        for (int i = 0; i < merged.length; i++) {
            int key = merged[i];
            if (countMap.containsKey(key)) {
                int count = countMap.get(key);
                count++;
                countMap.put(key, count);
            } else countMap.put(key, 1);
        }
        if (countMap.get(valueToEvaluate) == null) occurrences = 0;
        else occurrences = countMap.get(valueToEvaluate);
        return occurrences;
    }

    public Map.Entry<Integer, Integer> mostCommon(Integer[] array) {
        return null;
    }
}
