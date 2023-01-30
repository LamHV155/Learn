package DSA._3_Sorting;

public class InterChangeSort {

    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 3, 9, 4, 6, 2};
        printArray(nums);
        interChangeSort(nums);
        System.out.println();
        printArray(nums);
    }

    private static void interChangeSort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    int swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                }
            }
        }
    }

    private static void printArray(int[] nums){
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

}
