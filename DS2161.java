public class DS2161 {
    class Solution{
        public static int [] pivotArray(int[] nums, int pivot){
            int n = nums.length;
            int m=0;
            int arr[] = new int [n];
            for(int i=0;i<n;i++){
                if(nums[i] < pivot){
                    arr[m] = nums[i];
                    m++;
                }
            }
            for(int i=0;i<n;i++){
                if(nums[i] == pivot){
                    arr[m] = nums[i];
                    m++;
                }
            }
            for(int i=0;i<n;i++){
                if(nums[i] > pivot){
                    arr[m] = nums[i];
                    m++;
                }
            }
            return arr;
        }
        public static void main(String[] args) {
            int arr[] = {9,12,5,10,14,3,10};
            int news[] =  pivotArray(arr,10);
            for(int i=0;i<news.length;i++){
                System.out.print(news[i]+" ");
            }
           
        }
    }
}
