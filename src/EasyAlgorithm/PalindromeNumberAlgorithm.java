package EasyAlgorithm;

import EasyAlgorithm.factory.AlgorithmFactory;

public class PalindromeNumberAlgorithm implements AlgorithmFactory {

    @Override
    public void runAlgorithm() {
        example0();
        example1();
        example2();
    }

    private void example0() {
        System.out.println(isPalindrome(121));
    }

    private void example1() {
        System.out.println(isPalindrome(-121));
    }

    private void example2() {
        System.out.println(isPalindrome(10));
    }

    public boolean isPalindrome(int x) {
        var string = String.valueOf(x);

        int start = 0;
        int end = string.length() - 1;

        while (start < end) {
            if (string.charAt(end) != string.charAt(start)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
