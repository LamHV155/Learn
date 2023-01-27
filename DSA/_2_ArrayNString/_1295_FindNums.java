//1295 Find Numbers with Even Number of Digits
package DSA._2_ArrayNString;
public class _1295_FindNums {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(isEvenNum(num)){
                count++;
            }
        }
        return count;
    }
    public static Boolean isEvenNum(int num) {
        int count = 1;
        num /= 10;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count % 2 == 0;
    }
}
