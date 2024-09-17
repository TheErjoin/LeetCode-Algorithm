import EasyAlgorithm.factory.EasyAlgorithmFactory;
import EasyAlgorithm.type.EasyAlgorithmConstant;

public class Main {
    public static void main(String[] args) {

        var easyAlgorithmFactory = new EasyAlgorithmFactory();
        var algorithmFactory = easyAlgorithmFactory.createAlgorithm(EasyAlgorithmConstant.SCORE_OF_A_STRING);
        algorithmFactory.runAlgorithm();
    }
}