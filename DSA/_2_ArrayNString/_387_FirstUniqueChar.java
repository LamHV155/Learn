package DSA._2_ArrayNString;

public class _387_FirstUniqueChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int[] countCharArray = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            countCharArray[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < len; i++) {
            if(countCharArray[s.charAt(i) - 97] == 1){
                return i;
            }
        }
        return -1;
    }
}
