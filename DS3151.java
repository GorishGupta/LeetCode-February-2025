public class DS3151{
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] % 2 == nums[i+1] % 2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TEST
        DS3151 obj = new DS3151();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(obj.isArraySpecial(nums));
    }
}