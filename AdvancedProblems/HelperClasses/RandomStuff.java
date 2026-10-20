package AdvancedProblems.HelperClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStuff {
    private double val1;
    private String val2;
    private int val3;

    private Random random = new Random();

    private static String[] stringChoices = {
            "A",
            "B",
            "C",
    };

    public RandomStuff() {
        val1 = random.nextDouble(random.nextDouble() * 100);
        val2 = stringChoices[random.nextInt(stringChoices.length)];
        val3 = random.nextInt(random.nextInt() * 1000);
    }
}
