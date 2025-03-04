public class DS1780 {
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
        public static void main(String[] args) {
           int n = 27;
              Solution solution = new Solution();
                System.out.println(solution.checkPowerofThree(n));
                
        }
    }
}
