public class DS1780 {
    // 1780. Check if Number is a Sum of Powers of Three
    // Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.
    class Solution{
        public boolean checkPowerofThree (int n){
            if(n<=0){
                return false;
            }
            while(n%3==0){
                n/=3;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.checkPowerofThree(12));
        System.out.println(s.checkPowerofThree(91));
    }
}
