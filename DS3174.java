import java.util.Stack;
public class DS3174 {
    class Solution{
        public String clearDigits(String s){
            Stack<Character> stack= new Stack<>();
            for(char ch : s.toCharArray()){
                if(Character.isDigit(ch) && !stack.isEmpty()){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }

            StringBuilder result = new StringBuilder();
            while(!stack.isEmpty()){
                result.append(stack.pop());
            }
            return result.reverse().toString();
        }
        public static void main(){
            DS3174 obj = new DS3174();
            Solution solution = obj.new Solution();
            System.out.println(solution.clearDigits("a1b2c3d4"));
            System.out.println(solution.clearDigits("a1b2c3d4e5"));

        }
    }
}
