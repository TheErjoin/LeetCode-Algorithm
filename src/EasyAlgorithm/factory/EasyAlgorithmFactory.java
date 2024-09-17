package EasyAlgorithm.factory;

import EasyAlgorithm.*;
import EasyAlgorithm.type.EasyAlgorithmConstant;

public class EasyAlgorithmFactory implements CreationEasyAlgorithmFactory {
    @Override
    public AlgorithmFactory createAlgorithm(EasyAlgorithmConstant easyAlgorithmConstant) {
        return switch (easyAlgorithmConstant) {
            case TWO_SUM -> new TwoSumAlgorithm();
            case PALINDROME_NUMBER -> new PalindromeNumberAlgorithm();
            case SUM_OF_DIGITS_OF_STRING_AFTER_CONVERT -> new SumOfDigitsOfStringAfterConvertAlgorithm();
            case ROMAN_TO_INT -> new RomanToIntAlgorithm();
            case LONGEST_COMMON_PREFIX -> new LongestCommonPrefixAlgorithm();
            case SCORE_OF_A_STRING -> new ScoreOfAString();
            case VALID_PARENTHESES -> new ValidParentheses();
            case LENGTH_OF_LAST_WORLD -> new LengthOfLastWord();
            case REMOVE_ALGORITHMS -> new RemoveDuplicates();
            case MERGE_TWO_SORTED_LISTS -> new MergeTwoSortedLists();
            case PLUS_ONE -> new PlusOne();
            default -> throw new IllegalArgumentException("Unable algorithm type");
        };
    }
}
