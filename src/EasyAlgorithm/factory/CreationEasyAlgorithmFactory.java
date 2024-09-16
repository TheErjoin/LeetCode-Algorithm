package EasyAlgorithm.factory;

import EasyAlgorithm.type.EasyAlgorithmConstant;

public interface CreationEasyAlgorithmFactory {

    AlgorithmFactory createAlgorithm(EasyAlgorithmConstant easyAlgorithm);
}
