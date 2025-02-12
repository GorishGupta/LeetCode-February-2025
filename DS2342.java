import java.util.Arrays;
public class DS2342 {
    class Solution {
    public int maximumSum(int[] nums) {
        int mp[] = new int[82];
        Arrays.fill(mp,-1);
        int ans = -1;

        for(int num :nums){
            int sumDigits = 0, temp = num ;
            while(temp > 0){
                sumDigits += temp % 10;
                temp /= 10;
            }

            if(mp[sumDigits] != -1){
                ans = Math.max(ans, num + mp[sumDigits]);
            }

            mp[sumDigits] = Math.max(mp[sumDigits], num);
        }
        return ans;
    }
}
    public static void main(String[] args) {
        DS2342 obj = new DS2342();
        Solution solution = obj.new Solution();
        int[] nums = {55, 3, 6, 7, 8, 9, 11, 12, 13, 14};
        System.out.println(solution.maximumSum(nums));
    }
    }
