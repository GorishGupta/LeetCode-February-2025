public class DS1092 {
    //solution class
    class Solution {
        public String shortestCommonSupersequence(String s1, String s2) {
            int n = s1.length();
            int m = s2.length();
            int dp[][] = new int[n+1][m+1];
            if(s1.charAt(0)==s2.charAt(0)) dp[0][0] = 1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                    if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                    else{
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
            int i = n;
            int j = m;
    
            StringBuilder ans = new StringBuilder();
    
            while(i>0 && j>0){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    ans.append(s1.charAt(i-1));
                    i--;
                    j--;
                } else if(dp[i-1][j] > dp[i][j-1]){
                    ans.append(s1.charAt(i-1));
                    i--;
                } else{
                    ans.append(s2.charAt(j-1));
                    j--;
                }
            }
    
            while(i>0){
                ans.append(s1.charAt(i-1));
                i--;
            } 
    
            while(j>0){
                ans.append(s2.charAt(j-1));
                j--;
            }
    
    
            ans.reverse();
            String res = new String(ans);
            return res;
        }
    
    }
    public static void main(String[] args) {
        DS1092 ds1092 = new DS1092();
        DS1092.Solution solution = ds1092.new Solution();
        // Test cases
        
        String s1 = "abac";
        String s2 = "cab";
        System.out.println(solution.shortestCommonSupersequence(s1, s2)); // "cabac"
        s1 = "abac";
        s2 = "cab";
        System.out.println(solution.shortestCommonSupersequence(s1, s2)); // "cabac"
        s1 = "bbbaaaba";
        s2 = "bbababbb";
        System.out.println(solution.shortestCommonSupersequence(s1, s2)); // "bbabaaababbb"
    }
}