import java.util.*;
public class DS1752 {
    class Solution {
        public boolean check(int[] nums) {
            int size = nums.length;
            int arr[] = nums.clone();
            Arrays.sort(arr);
            for(int i=0;i<size;i++){
                boolean isMatch = true;
                for(int j=0;j<size;j++){
                    if(nums[(i + j) % size] != arr[j]){
                        isMatch = false;
                        break;
                    }
                }
                if(isMatch){
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        DS1752 obj = new DS1752();
        Solution solution = obj.new Solution();
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(solution.check(nums));
    }
}
