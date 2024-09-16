import EasyAlgorithm.factory.EasyAlgorithmFactory;
import EasyAlgorithm.type.EasyAlgorithmConstant;

public class Main {
    public static void main(String[] args) {

        var easyAlgorithmFactory = new EasyAlgorithmFactory();
        var algorithmFactory = easyAlgorithmFactory.createAlgorithm(EasyAlgorithmConstant.REMOVE_ALGORITHMS);
        algorithmFactory.runAlgorithm();
    }
}