package EasyAlgorithm;

import EasyAlgorithm.factory.AlgorithmFactory;

import java.util.Arrays;

public class PlusOne implements AlgorithmFactory {

    @Override
    public void runAlgorithm() {
        int[] numbers = {9};
        System.out.println(Arrays.toString(plusOne(numbers)));
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        var numbers = new int[digits.length + 1];
        numbers[0] = 1;
        return numbers;
    }
}
