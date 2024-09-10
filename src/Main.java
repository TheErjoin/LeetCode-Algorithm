import EasyAlgorithm.factory.EasyAlgorithmFactory;
import EasyAlgorithm.type.EasyAlgorithmType;

public class Main {
    public static void main(String[] args) {

        var easyAlgorithmFactory = new EasyAlgorithmFactory();
        var algorithmFactory = easyAlgorithmFactory.createAlgorithm(EasyAlgorithmType.SCORE_OF_A_STRING);
        algorithmFactory.runAlgorithm();
    }
}