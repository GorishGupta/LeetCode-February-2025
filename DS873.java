import java.util.HashSet;
import java.util.Set;
public class DS873 {
    class Solution {

        public int lenLongestFibSubseq(int[] arr) {
            int n = arr.length;
            // Store array elements in set for O(1) lookup
            Set<Integer> numSet = new HashSet<>();
            for (int num : arr) {
                numSet.add(num);
            }
    
            int maxLen = 0;
            // Try all possible first two numbers of sequence
            for (int start = 0; start < n; ++start) {
                for (int next = start + 1; next < n; ++next) {
                    // Start with first two numbers
                    int prev = arr[next];
                    int curr = arr[start] + arr[next];
                    int len = 2;
    
                    // Keep finding next Fibonacci number
                    while (numSet.contains(curr)) {
                        // Update values for next iteration
                        int temp = curr;
                        curr += prev;
                        prev = temp;
                        maxLen = Math.max(maxLen, ++len);
                    }
                }
            }
            return maxLen;
        }
    }
    public static void main(String[] args) {
        DS873 ds873 = new DS873();
        DS873.Solution solution = ds873.new Solution();
        
        // Test cases
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(solution.lenLongestFibSubseq(arr)); // 5
        arr = new int[]{1, 3, 7, 11, 12, 14, 18};
        System.out.println(solution.lenLongestFibSubseq(arr)); // 3
        arr = new int[]{1, 5, 7, 10, 12, 15, 20};
        System.out.println(solution.lenLongestFibSubseq(arr)); // 0
    }
}
