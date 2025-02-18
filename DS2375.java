public class DS2375 {
    class Solution {
        public String smallestNumber(String pattern) {
            int n = pattern.length();
            StringBuilder result = new StringBuilder();
            int[] stack = new int[n + 1]; 
            int index = 0;
    
            for (int i = 0; i <= n; i++) {
                stack[index++] = i + 1;
    
                if (i == n || pattern.charAt(i) == 'I') {
                    while (index > 0) {
                        result.append(stack[--index]);
                    }
                }
            }
    
            return result.toString();
        }
    }
    public static void main(String[] args) {
        DS2375 d = new DS2375();
        Solution s = d.new Solution();
        System.out.println(s.smallestNumber("IDID"));
    }
}
