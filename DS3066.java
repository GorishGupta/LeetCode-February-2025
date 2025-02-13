import java.util.*;
public class DS3066 {
    class Solution {
        public int minOperations(int[] nums, int k) {
            PriorityQueue<Long> heap = new PriorityQueue<>();
            for(int i: nums){heap.add((long)i);}
            int count = 0;
            while(heap.peek() < k){
                long left = heap.poll();
                long right = heap.poll();
                heap.add(Math.min(left, right) *2   + Math.max(left, right));
                count++;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        DS3066 d = new DS3066();
        DS3066.Solution s = d.new Solution();
        int[] nums = {1,2,3,4};
        int k = 11;
        System.out.println(s.minOperations(nums, k));
    }    
}
