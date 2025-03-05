import java.util.*;
public class DS2579 {
    class solution {
        public long colouredCells(int n){
            return 1+4L*4*n*(n-1)/2;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(colouredCells(num));
        }
    }
}
