package EasyAlgorithm.factory;

import EasyAlgorithm.*;
import EasyAlgorithm.type.EasyAlgorithmType;

public class EasyAlgorithmFactory implements CreationEasyAlgorithmFactory {
    @Override
    public AlgorithmFactory createAlgorithm(EasyAlgorithmType easyAlgorithmType) {
        return switch (easyAlgorithmType) {
            case TWO_SUM -> new TwoSumAlgorithm();
            case PALINDROME_NUMBER -> new PalindromeNumberAlgorithm();
            case SUM_OF_DIGITS_OF_STRING_AFTER_CONVERT -> new SumOfDigitsOfStringAfterConvertAlgorithm();
            case ROMAN_TO_INT -> new RomanToIntAlgorithm();
            case LONGEST_COMMON_PREFIX -> new LongestCommonPrefixAlgorithm();
            case SCORE_OF_A_STRING -> new ScoreOfAString();
            default -> throw new IllegalArgumentException("Unable algorithm type");
        };
    }
}
