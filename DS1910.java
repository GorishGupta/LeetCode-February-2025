public class DS1910 {
    class Solution {
        public String removeOccurrences(String s, String part) {
            int n = s.length();
            int index = s.indexOf(part);
            while(index != -1){
                s = s.substring(0, index) + s.substring(index+part.length());
                n = s.length();
                index = s.indexOf(part);
            } 
            return s;        
        }
    }
    //main function
    public static void main(String[] args) {
        DS1910 obj = new DS1910();
        Solution solution = obj.new Solution();
        System.out.println(solution.removeOccurrences("daabcbaabcbc", "abc"));
        System.out.println(solution.removeOccurrences("axxxxyyyyxyxyxyxyxy", "xy"));
    }
}
