public class DS1980 {
    class Solution{
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
}
