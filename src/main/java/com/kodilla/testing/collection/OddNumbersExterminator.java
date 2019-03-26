package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {
    List<Integer> result = new ArrayList<>();

    List<Integer> exterminate(ArrayList<Integer> numbers) {
        for (Integer x : numbers) {
            if (x % 2 == 0) {
                result.add(x);
            }
        }
        return (ArrayList<Integer>) result;
    }

    int checkIfEmpty(ArrayList<Integer> numbers) {
        return numbers.size();
    }
}