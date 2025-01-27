package org.example;

import java.util.ArrayList;

public class Factorizer {
    public ArrayList<Integer> primeFactors(Integer n) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        if (n == 0) {
            return primeNumbers;
        }
        while (n % 2 == 0) {
            primeNumbers.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            primeNumbers.add(n);
        }
        return primeNumbers;
    }
}
