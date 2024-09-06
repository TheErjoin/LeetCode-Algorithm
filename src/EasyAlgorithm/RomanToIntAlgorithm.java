package EasyAlgorithm;

import EasyAlgorithm.factory.AlgorithmFactory;

import java.util.HashMap;

public class RomanToIntAlgorithm implements AlgorithmFactory {
    @Override
    public void runAlgorithm() {
        example0();
        example1();
        example2();
    }

    private void example2() {
        System.out.println(romanToInt("XV"));
    }

    private void example1() {
        System.out.println(romanToInt("III"));
    }

    private void example0() {
        System.out.println(romanToInt("CD"));
    }

    public int romanToInt(String s) {
        var romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        var result = 0;
        var length = s.length();

        for (int i = 0; i < length; i++) {
            var currentVal = romanMap.get(s.charAt(i));

            if (i < length - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result;
    }
}
