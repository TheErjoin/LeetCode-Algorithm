package EasyAlgorithm;

import EasyAlgorithm.factory.AlgorithmFactory;

public class SumOfDigitsOfStringAfterConvertAlgorithm implements AlgorithmFactory {

    @Override
    public void runAlgorithm() {
        example0();
        example1();
        example2();
    }

    private void example0() {
        var s = "iiii";
        var k = 1;
        System.out.println(getLucky(s,k));
    }

    private void example1() {
        var s = "leetcode";
        var k = 2;
        System.out.println(getLucky(s,k));
    }

    private void example2() {
        var s = "zbax";
        var k = 2;
        System.out.println(getLucky(s,k));
    }

    public int getLucky(String s, int k) {
        var transformedStr = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int position = ch - 'a' + 1;
            transformedStr.append(position);
        }

        int currentSum = sumOfDigits(transformedStr.toString());

        for (int i = 1; i < k; i++) {
            currentSum = sumOfDigits(Integer.toString(currentSum));
        }

        return currentSum;
    }

    private int sumOfDigits(String numStr) {
        int sum = 0;
        for (char ch : numStr.toCharArray()) {
            sum += ch - '0';
        }
        return sum;
    }
}
