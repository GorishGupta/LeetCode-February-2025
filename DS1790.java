public class DS1790 {
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
        {
        return true;
        }
        for(int i=0;i<s1.length();i++)
        {
        for(int j=i+1;j<s1.length();j++)
        {
        char [] arr = s1.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        String check = new String(arr);
        if(check.equals(s2))
        {
        return true;
        }
        }
        }
        return false;
        }
    }
    public static void main(String[] args) {
        DS1790 obj = new DS1790();
        Solution solution = obj.new Solution();
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(solution.areAlmostEqual(s1, s2));
    }
}
