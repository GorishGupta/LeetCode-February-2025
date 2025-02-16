public class DS1718 {
    class Solution {
        public int[] constructDistancedSequence(int n) {
            int[] result = new int[2 * n - 1];
            boolean[] used = new boolean[n + 1];
            backtrack(result, used, n, 0);
            return result;
        }
        private boolean backtrack(int[] result, boolean[] used, int n, int index){
            while(index < result.length && result[index] != 0){
                index++;
            }
            if(index == result.length){
                return true;
            }
            for(int i = n; i >= 1; i--){
                if(used[i]) continue;
    
                if(i == 1){
                    result[index] = 1;
                    used[1] = true;
                    if(backtrack(result, used, n, index + 1)) return true;
                    result[index] = 0;
                    used[1] = false;
                }
                else{
                    if(index + i < result.length && result[index + i] == 0){
                        result[index] = i;
                        result[index + i] = i;
                        used[i] = true;
                        if(backtrack(result, used, n, index + 1)) return true;
                        result[index] = 0;
                        result[index + i] = 0;
                        used[i] = false;
                    }
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        DS1718 d = new DS1718();
        Solution s = d.new Solution();
        int[] res = s.constructDistancedSequence(3);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}
