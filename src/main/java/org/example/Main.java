package org.example;

import java.util.Arrays;
import java.util.List;

class Main {

    static void main(String[] args) {

        if (args.length > 0) {
            System.out.println("Argumentos recibidos: " + args.length);
        }

        List<Boolean> list1 = Arrays.asList(
                true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true
        );

        List<Boolean> list2 = Arrays.asList(false, false, false);

        System.out.println(SheepCounter.countSheep(list1));
        System.out.println(SheepCounter.countSheep(list2));
    }
}
