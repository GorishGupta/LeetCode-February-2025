public class DS1749 {
    class Solution{
        public int maxAbsoluteSum(int nums[]){
            int sum =0, minsum =0, maxsum =0;
            for(int num :nums){
                sum += num;
                if(sum > maxsum){
                    maxsum = sum;
                }
                if(sum < minsum){
                    minsum = sum;
                }
            }
            return Math.abs(maxsum-minsum);
        }    
    }
    public static void main(String[] args) {
        DS1749 ds1749 = new DS1749();
        DS1749.Solution solution = ds1749.new Solution();
        
        // Test cases
        int[] nums = {1, -3, 2, 3, -4};
        System.out.println(solution.maxAbsoluteSum(nums)); // 5
        nums = new int[]{2, -5, 1, -4, 3, -2};
        System.out.println(solution.maxAbsoluteSum(nums)); // 8
        nums = new int[]{-7, -1, 0, -2, 1, 3, 8, -2, -6, -1, -10, -6, -6, 8, -4, -9, -4, -10, -8, -9, -10, -6, -10, -6, -5, -10, -1, -6, -2, -2, -5
            };
        System.out.println(solution.maxAbsoluteSum(nums)); // 44
        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
    }
}
