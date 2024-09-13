package EasyAlgorithm;

import EasyAlgorithm.factory.AlgorithmFactory;

import java.util.Stack;

public class ValidParentheses implements AlgorithmFactory {
    @Override
    public void runAlgorithm() {
        example0();
        example1();
        example2();
        example3();
    }

    private void example3() {
        System.out.println(isValid("()"));
    }

    private void example2() {
        System.out.println(isValid("()[]{}"));
    }

    private void example1() {
        System.out.println(isValid("(]"));
    }

    private void example0() {
        System.out.println(isValid("([])"));
    }

    public boolean isValid(String s) {
        var characters = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            var charAt = s.charAt(i);
            if (charAt == '(' || charAt == '[' || charAt == '{') {
                characters.push(charAt);
            } else if (characters.isEmpty() || !isEqualsBracket(characters.pop(), charAt)) {
                return false;
            }
        }

        return characters.isEmpty();
    }

    private boolean isEqualsBracket(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
