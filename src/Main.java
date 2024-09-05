import EasyAlgorithm.factory.EasyAlgorithmFactory;
import EasyAlgorithm.factory.EasyAlgorithmType;

public class Main {
    public static void main(String[] args) {

        var easyAlgorithmFactory = new EasyAlgorithmFactory();
        var algorithmFactory = easyAlgorithmFactory.createAlgorithm(EasyAlgorithmType.PALINDROME_NUMBER_ALGORITHM);
        algorithmFactory.runAlgorithm();
    }
}