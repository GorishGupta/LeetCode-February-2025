public class DS3105 {
    class Solution {
        public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int count1 = 1;
        int count2 = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                count1++;
            }
            else{
                count1 = 1;}
                if(nums[i] > nums[i+1]){
                    count2++;
                }
                else{
                    count2 = 1;
                }
                int val = Math.max(count1, count2);
                max = Math.max(max,val);
            
        }  
        return max;
        }
    }
    public static void main(String[] args) {
        DS3105 obj = new DS3105();
        Solution solution = obj.new Solution();
        int[] nums = {5, 3, 2, 4, 1};
        System.out.println(solution.longestMonotonicSubarray(nums));
    }
}
