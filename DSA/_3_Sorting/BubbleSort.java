package DSA._3_Sorting;

/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {4,3,7,8,1,5,9,3,2};
        printArray(nums);
        sort(nums);
        System.out.println();
        printArray(nums);
    }

    private static void sort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = nums.length-1; j > i; j--) {
                if(nums[j] < nums[j-1]){
                    int swap = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = swap;
                }
            }
        }
    }

    private static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}