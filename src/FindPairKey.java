import java.util.HashMap;
import java.util.Map;

public class FindPairKey {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 };
        int target = 3;
        problem7(arr, target);
}
public static void problem7(int[] arr, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        map.put(arr[i], i);
    }
    for (int i = 0; i < arr.length; i++) {
        int complement = target - arr[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            System.out.println(arr[i] + " " + complement);
        }
    }
}
}
