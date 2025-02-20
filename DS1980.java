public class DS1980 {
    // Leetcode Question 1980 solution
    class Solution{
        // function to find the different binary string
        public String findDiffrentBinaryString(String [] nums){
            StringBuilder result = new StringBuilder();
            for(int i=0;i<nums.length;i++){
                if(nums[i].charAt(i)=='0'){
                    result.append('1');
                }
                else{
                    result.append('0');
                }
            }
            return result.toString();
        }
    }
    // main  function 
    public static void main(String[] args) {
        DS1980 d = new DS1980();
        Solution s = d.new Solution();
        String [] nums = {"00","01"};
        System.out.println(s.findDiffrentBinaryString(nums));
    }
}
