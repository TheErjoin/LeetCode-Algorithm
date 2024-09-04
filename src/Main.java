import EasyAlgorithm.factory.EasyAlgorithmFactory;
import EasyAlgorithm.factory.EasyAlgorithmType;

public class Main {
    public static void main(String[] args) {

        var easyAlgorithmFactory = new EasyAlgorithmFactory();
        var algorithmFactory = easyAlgorithmFactory.createAlgorithm(EasyAlgorithmType.SUM_OF_DIGITS_OF_STRING_AFTER_CONVERT_ALGORITHM);
        algorithmFactory.runAlgorithm();
    }
}