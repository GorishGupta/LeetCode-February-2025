import java.util.ArrayList;

public class DS1352 {
    class ProductOfNumbers {
    ArrayList<Integer> list = new ArrayList<>();
    int prod = 1;

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        if(num == 0){
            list = new ArrayList<>();
            prod = 1;
            return;
        }
        prod = prod * num;
        list.add(prod);
    }
    
    public int getProduct(int k) {
        if(list.size() < k) return 0;
        int ans = list.get(list.size() - 1);
        if(list.size() == k) return ans;
        return ans / list.get(list.size() - 1 - k);
    }
}
public static void main(String[] args) {
    DS1352 d = new DS1352();
    DS1352.ProductOfNumbers p = d.new ProductOfNumbers();
    p.add(3);
    p.add(0);
    p.add(2);
    p.add(5);
    p.add(4);
    System.out.println(p.getProduct(2));
    System.out.println(p.getProduct(3));
    System.out.println(p.getProduct(4));
    p.add(8);
    System.out.println(p.getProduct(2));
}
}
