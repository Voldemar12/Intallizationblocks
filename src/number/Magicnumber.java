package number;

import java.io.OptionalDataException;

public class Magicnumber {

    private final static int[] NUMBERS;
    private static int next = 0;

    private int number;
    private int[] array;

    {
        System.out.println("yes");
        array = new int[1];
        for (int i = 0; i < NUMBERS.length; i++) {
            Magicnumber magicnumber = new Magicnumber();
        }

    }

    static {
        NUMBERS = new int[]{1, 3, 7, 15, 31, 63};
    }


    {
        this.number = NUMBERS[next % NUMBERS.length];
        next++;
    }

    public Magicnumber(int base) {
        this.number += base;
    }
}
