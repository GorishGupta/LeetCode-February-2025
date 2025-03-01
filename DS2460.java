public class DS2460 {
    class Solution{
        public int[] applyoperations(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]==arr[i+1]){
                    arr[i] = 2*arr[i];
                    arr[i+1] = 0;
                }
            }
            int index =0;
            for(int num :arr){
                //normal case
                if(num != 0){
                    arr[index++] = num;
                }
            }
                //when there is zero
            while(index <arr.length){
                arr[index++] = 0;
            }           
            return arr;
        }
    }
}
