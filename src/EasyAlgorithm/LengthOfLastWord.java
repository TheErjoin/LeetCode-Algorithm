package EasyAlgorithm;

import EasyAlgorithm.factory.AlgorithmFactory;

public class LengthOfLastWord implements AlgorithmFactory {
    @Override
    public void runAlgorithm() {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public int lengthOfLastWord(String s) {
        int result = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            result++;
            i--;
        }
        return result;
    }
}
