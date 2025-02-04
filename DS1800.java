public class DS1800 {
    class solution
{
    public int maxAscendingSum(int [] nums){
        int sum = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                sum += nums[i];
            }
            else{
                sum = nums[i];
            }
            max = Math.max(max,sum);
        }
        return max;          
    }
}
public static void main(String[] args) {
    DS1800 obj = new DS1800();
    solution solution = obj.new solution();
    int[] nums = {10,20,30,5,10,50};
    System.out.println(solution.maxAscendingSum(nums));
}
}
