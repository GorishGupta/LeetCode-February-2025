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
        DS1524 ds1524 = new DS1524();
        DS1524.Solution solution = ds1524.new Solution();
        
        // Test cases
        int[] arr = {1, 3, 5};
        System.out.println(solution.numOfSubarrays(arr)); // 4
        arr = new int[]{2, 4, 6};
        System.out.println(solution.numOfSubarrays(arr)); // 0
        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(solution.numOfSubarrays(arr)); // 16
        arr = new int[]{100, 100, 99, 99};
        System.out.println(solution.numOfSubarrays(arr)); // 4
        arr = new int[]{7};
        System.out.println(solution.numOfSubarrays(arr)); // 1  
    }
}
