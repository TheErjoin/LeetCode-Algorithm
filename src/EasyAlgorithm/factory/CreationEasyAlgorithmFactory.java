package EasyAlgorithm.factory;

import EasyAlgorithm.type.EasyAlgorithmType;

public interface CreationEasyAlgorithmFactory {

    AlgorithmFactory createAlgorithm(EasyAlgorithmType easyAlgorithm);
}
