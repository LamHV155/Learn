import java.util.HashMap;

public class _01_TwoSum {
    public static int[] TwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapResult = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int numTemp = target - nums[i];
            if(mapResult.containsKey(numTemp)){
                return new int[]{mapResult.get(numTemp),i};
            }
            mapResult.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] input = new int[] {3,3};
        int[] output = TwoSum(input, 6);
        for (int o : output) {
        System.out.println(o);  
        }
    }
}