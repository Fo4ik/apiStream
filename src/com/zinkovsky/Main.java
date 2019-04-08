package com.zinkovsky;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> randomList = getRandom();
        int sum = randomList.stream()
                .mapToInt(x -> x*x)
                .sum();
        System.out.println(sum/randomList.size());
    }

    public static List<Integer> getRandom() {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomList.add(random.nextInt(10));
        }
        return randomList;
    }
}
