package org.example;

import java.util.List;

public class SheepCounter {

    public static String countSheep(List<Boolean> sheepList) {

        long sheepCount = sheepList.stream()
                .filter(Boolean.TRUE::equals)
                .count();

        if (sheepCount > 0) {
            return "There are " + sheepCount + " sheep in total";
        }

        return "UPS!!! Wolfs eaten Sheeps";
    }
}