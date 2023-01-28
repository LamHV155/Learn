package DSA._2_ArrayNString;

public class _27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        //System.out.println(removeElement(nums, val));
        System.out.println(removeElementWith2Pointers(nums, val));


    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int len = nums.length;
        while(i < len){
            if(nums[i] == val){
                int len2 = len - 1;
                for (int j = i; j < len2; j++) {
                    nums[j] = nums[j+1];
                }
                len--;
            }
            else{
                i++;
            }
        }
        return len;
    }

    public static int removeElementWith2Pointers(int[] nums, int val){
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
