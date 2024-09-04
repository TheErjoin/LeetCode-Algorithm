package EasyAlgorithm;

import EasyAlgorithm.factory.AlgorithmFactory;

import java.util.Arrays;

public class TwoSumAlgorithm implements AlgorithmFactory {

    @Override
    public void runAlgorithm() {
        example0();
        example1();
        example2();
    }

    private void example0() {
        int[] nums = {5, 5, 12, 15};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private void example1() {
        int[] nums = {2, 1, 2, 19, 9, 7, 21, 5, 19};
        int target = 24;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private void example2() {
        int[] nums = {2, 7, 5, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
