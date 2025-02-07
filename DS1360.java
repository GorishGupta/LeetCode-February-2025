import java.util.HashMap;

public class DS1360 {
    class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        int len = queries.length;
        int ans[] = new int[len];
        int count = 0;
        for(int i=0;i<len;i++){
            int first = queries[i][0];
            int second = queries[i][1];
                if(!map.containsKey(first)){
                count++;
                map.put(first,second);
            }
            else{
                int val=  map.get(first);
                if(freq.get(val)== 1){
                    freq.remove(val);
                }
                else{
                    freq.put(val, freq.get(val)- 1);
                }
                map.put(first, second);
            }
            freq.put(second, freq.getOrDefault(second, 0) + 1);
            ans[i] = freq.size();
        }
        return ans;
    }
}
public static void main(String[] args) {
    DS1360 obj = new DS1360();
    Solution solution = obj.new Solution();
    int limit = 2;
    int[][] queries = {{1, 1}, {2, 2}, {1, 2}, {1, 1}, {3, 3}};
    int[] result = solution.queryResults(limit, queries);
    for(int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");
    }
    System.out.println();
}
}
