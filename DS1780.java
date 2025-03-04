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
    }
}
