package EasyAlgorithm;

import EasyAlgorithm.factory.AlgorithmFactory;

public class ScoreOfAString implements AlgorithmFactory {
    @Override
    public void runAlgorithm() {
        System.out.println(scoreOfString("hello"));
    }

    public int scoreOfString(String s) {
        var sum = 0;
        int current = s.charAt(0);
        int next;
        for (int i = 0; i < s.length(); i++) {
            next = s.charAt(i);
            sum += Math.abs(current - next);
            current = next;
        }

        return sum;
    }
}
