public class DS1524 {
    class Solution {
        public int numOfSubarrays(int[] arr) {
            long oddCount = 0, prefixSum = 0;
            for(int a : arr){
                prefixSum += a;
                oddCount += prefixSum % 2;
            }
            oddCount += (arr.length - oddCount) * oddCount;
            return (int)(oddCount % 1_000_000_007);
        }
    }
    public static void main(String[] args) {
        
    }
}
