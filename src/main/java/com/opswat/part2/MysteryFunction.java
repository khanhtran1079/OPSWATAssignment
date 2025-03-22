package com.opswat.part2;

public class MysteryFunction {
    public static void main(String[] args) {
        int[] data = {12, 4, 6, 9, 2};
        for (int i = 0; i < data.length; i++) {
            data[i] = transform(data[i]);
        }
        for (int value : data) {
            System.out.println(value);
        }
    }

    private static int transform(int input) {
        int result = 0;
        while (input > 0) {
            result += (input % 10) * (input % 10);
            input /= 10;
        }
        return result;
    }

    /**
     * Explain part:
     * transform method will: squaring the digits and summing them up
     * for example:
     * 12 = (2*2) + (1*1) = 4 + 1 =5
     * 4 = (4*4) = 16
     * 6 = (6*6) = 36
     * 9 = (9*9) = 81
     * 2 = (2*2) = 4
     */

    /**
     * Considerations:
     * 1. What if a < 0 in data[] => Wrong calculation because of input > 0
     * Solve by adding this line of code: at the start of the transform method: input = Math.abs(input)
     * 2. What if input equal Integer.MAX_VALUE => Causing Integer Overflow because of squaring
     * Solve by handle result with Long type
     */

    /**
     * Refactor: for me, we can change the result += (input % 10) * (input % 10)
     * To: result += Math.pow(input % 10, 2)
     */
}
