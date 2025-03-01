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
    public static void main(String[] args) {
        DS2460 ds2460 = new DS2460();
        DS2460.Solution solution = ds2460.new Solution();
        
        // Test cases
        int[] arr = {2, 2, 0, 4};
        int[] res = solution.applyoperations(arr);
        for(int num : res){
            System.out.print(num + " ");
        }
        System.out.println();
        arr = new int[]{0, 2, 2, 2};
        res = solution.applyoperations(arr);
        for(int num : res){
            System.out.print(num + " ");
        }
        System.out.println();
        arr = new int[]{2, 2, 2, 2};
        res = solution.applyoperations(arr);
        for(int num : res){
            System.out.print(num + " ");
        }
        System.out.println();
        arr = new int[]{2, 2, 2, 2, 2};
        res = solution.applyoperations(arr);
        for(int num : res){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
