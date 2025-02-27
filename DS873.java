import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class DS873 {
    class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> nums_set = new HashSet<>();

        for (int num : arr) {
            nums_set.add(num);
        }

        Map<Map.Entry<Integer, Integer>, Integer> sequences = new HashMap<>();

        for (int i = 2; i < arr.length; i++) {
            int third = arr[i];

            for (int j = i - 1; j > 0; j--) {
                int second = arr[j];

                if (second <= third / 2) {
                    break;
                }

                int first = third - second;

                if (nums_set.contains(first)) {
                    int sequence_len = sequences.getOrDefault(hashPair(second, first), 2);
                    sequences.put(hashPair(third, second), sequence_len + 1);
                }
            }
        }

        return sequences.values().stream().max(Integer::compare).orElse(0);
    }

    private Map.Entry<Integer, Integer> hashPair(int a, int b) {
        return Map.entry(a, b);
    }
}
}
