package DSA._2_ArrayNString;

/**
 * 88: Merge Sorted Array
 */
public class _88_MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        //int[] nums1 = {1,2,6,0,0,0};
        int[] nums2 = {1,2,3};
        //int[] nums2 = {2,3,5};
        //merge(nums1, 3, nums2, 3);
        mergeUsing2Pointers(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.println(num);
        }
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int num : nums2) {
            insert(num, nums1, m);
            m++;
        }
    }

    private static void mergeUsing2Pointers(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n -1;
        m -= 1;
        n -= 1;
        while(m >= 0 && n >= 0){
            if(nums1[m] <= nums2[n]){
                nums1[k--] = nums2[n--];
            }
            else{
                nums1[k--] = nums1[m--];
            }
        }
        while(n >= 0){
            nums1[k--] = nums2[n--];
        }
    }

    private static void insert(int num, int[] nums, int m) {
        Boolean isExistPosToInsert = false;
        for (int i = 0; i < m; i++) {
            if(nums[i] > num)
            {
                for (int j = m; j > i; j--) {
                    nums[j] = nums[j-1];
                }
                nums[i] = num;
                isExistPosToInsert = true;
                break;
            }
        }

        if(!isExistPosToInsert) nums[m] = num;
    }



}

