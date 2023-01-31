package DSA._3_Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 3, 9, 4, 6, 2};
        printArray(nums);
        sort(nums);
        System.out.println();
        printArray(nums);
    } 
    
    private static void sort(int[] nums) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            temp = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > temp) 
            {  
                nums[j + 1] = nums[j];  
                j = j - 1;  
            }  
            nums[j + 1] = temp;  
        }
    }

    private static void printArray(int[] nums){
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
