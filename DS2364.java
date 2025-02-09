import java.util.HashMap;
public class DS2364 {
    class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> bag = new HashMap<>();
        int len = nums.length;
        long count = 0;
        for(int i=0;i<len;i++){
            count += -1 + bag.merge(nums[i] - i, 1 , Integer:: sum );
        }
        return 1l * len * (len-1)/ 2-count;
        
    }
}
public static void main(String[] args) {
    DS2364 obj = new DS2364();
    Solution s = obj.new Solution();
    int[] nums = {1,2,3,4,5};
    System.out.println(s.countBadPairs(nums));
}
}
