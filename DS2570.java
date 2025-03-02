import java.util.ArrayList;
import java.util.List;

public class DS2570 {
    class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i=0;
        int j=0;
        // Merge the two arrays
        List<int[]> result = new ArrayList<>();
        while(i<m && j<n){
            if(nums1[i][0] == nums2[j][0]){
                result.add(new int[] {nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                result.add(nums1[i]);
                i++;
            }
            else{
                result.add(nums2[j]);
                j++;
            }
        }
        while(i < m){
            result.add(nums1[i]);
            i++;
        }
        while(j<n){
            result.add(nums2[j]);
            j++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
public static void main(String[] args) {
    DS2570 ds2570 = new DS2570();
    DS2570.Solution solution = ds2570.new Solution();
    
    // Test cases
    int[][] nums1 = {{1, 3}, {2, 4}, {5, 6}};
    int[][] nums2 = {{1, 2}, {3, 5}, {7, 8}};
    int[][] res = solution.mergeArrays(nums1, nums2);
    for(int[] num : res){
        System.out.print("[" + num[0] + ", " + num[1] + "] ");
    }
    System.out.println();
    nums1 = new int[][]{{1, 3}, {2, 4}, {5, 6}};
    nums2 = new int[][]{{1, 2}, {3, 5}, {7, 8}, {9, 10}};
    res = solution.mergeArrays(nums1, nums2);
    for(int[] num : res){
        System.out.print("[" + num[0] + ", " + num[1] + "] ");
    }
    System.out.println();
    nums1 = new int[][]{{1, 3}, {2, 4}, {5, 6}, {7, 8}};
    nums2 = new int[][]{{1, 2}, {3, 5}, {7, 8}};
    res = solution.mergeArrays(nums1, nums2);
    for(int[] num : res){
        System.out.print("[" + num[0] + ", " + num[1] + "] ");
    }
    System.out.println();
    nums1 = new int[][]{{1, 3}, {2, 4}, {5, 6}, {7, 8}};
    nums2 = new int[][]{{1, 2}, {3, 5}, {7, 8}, {9, 10}};
    res = solution.mergeArrays(nums1, nums2);
    for(int[] num : res){
        System.out.print("[" + num[0] + ", " + num[1] + "] ");
    }
    System.out.println();
}
}
