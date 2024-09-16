package EasyAlgorithm;

import EasyAlgorithm.factory.AlgorithmFactory;

public class RemoveDuplicates implements AlgorithmFactory {
    @Override
    public void runAlgorithm() {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[pointer]) {
                pointer++;
                nums[pointer] = nums[i];
            }
        }

        return pointer + 1;
    }
}
