package EasyAlgorithm.factory;

import EasyAlgorithm.PalindromeNumberAlgorithm;
import EasyAlgorithm.SumOfDigitsOfStringAfterConvertAlgorithm;
import EasyAlgorithm.TwoSumAlgorithm;

public class EasyAlgorithmFactory implements CreationEasyAlgorithmFactory {
    @Override
    public AlgorithmFactory createAlgorithm(EasyAlgorithmType easyAlgorithmType) {
        return switch (easyAlgorithmType) {
            case TWO_SUM_ALGORITHM -> new TwoSumAlgorithm();
            case PALINDROME_NUMBER_ALGORITHM -> new PalindromeNumberAlgorithm();
            case SUM_OF_DIGITS_OF_STRING_AFTER_CONVERT_ALGORITHM -> new SumOfDigitsOfStringAfterConvertAlgorithm();
            default -> throw new IllegalArgumentException("Unknown Toyota Sedan type");
        };
    }
}
