import java.util.*;
public class DS2349 {
    class NumberContainers {
        Map<Integer,Integer> m;
        Map<Integer,PriorityQueue<Integer>> d;
        public NumberContainers() {
            m = new HashMap<>();
            d = new HashMap<>();
        }
        public void change(int i, int n) {
            if(m.containsKey(i) && m.get(i)==n)return;
            m.put(i,n);
            d.computeIfAbsent(n,k->new PriorityQueue<>()).offer(i);
        }
        public int find(int n) {
            if(!d.containsKey(n)) return -1;
            PriorityQueue<Integer> pq = d.get(n);
            while(!pq.isEmpty() && m.get(pq.peek())!=n) pq.poll();
            return pq.isEmpty()? -1 : pq.peek();
        }
    }
    // Test
    public static void main(String[] args) {
        DS2349 obj = new DS2349();
        NumberContainers nc = obj.new NumberContainers();
        nc.change(1, 1);
        nc.change(2, 2);
        nc.change(1, 2);
        nc.change(1, 1);
        nc.change(3, 3);
        System.out.println(nc.find(1));
        System.out.println(nc.find(2));
        System.out.println(nc.find(3));
    }
}
