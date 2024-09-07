package EasyAlgorithm;

import EasyAlgorithm.factory.AlgorithmFactory;

public class LongestCommonPrefixAlgorithm implements AlgorithmFactory {
    @Override
    public void runAlgorithm() {
        example0();
        example1();
    }

    private void example0() {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    private void example1() {
        String[] strs = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        var prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
