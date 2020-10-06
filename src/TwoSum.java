import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 * A TwoSum solution with simple command-line interface.
 *
 * Description:
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 * Example :
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * @author Yanwei Zhu
 * @version 2020.10.06
 *
 */
class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                solution[0] = map.get(complement);
                solution[1] = i;
            }
            map.put(nums[i], i);
        }
        return solution;
    }

    public static void main(String[] args) {
        TwoSum myTwoSum = new TwoSum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int length = sc.nextInt();

        int[] nums = new int[length];

        System.out.println("enter array elements:");
        for(int i = 0; i < length; i++) {
            int userInput = sc.nextInt();
            nums[i] = userInput;
        }

        System.out.println("Enter target number:");
        int target = sc.nextInt();
        sc.close();

        // To test if array is successfully stored:
        // System.out.println(Arrays.toString(nums));

        int[] mySolution = myTwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(mySolution));
    }
}
