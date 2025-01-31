import java.util.HashMap;
import java.util.Map;
public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 ,6};
        int target = 9;
        problem8(arr, target);

    }

    public static void problem8(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == target) {
                count++;
            }
            if (map.containsKey(sum - target)) {
                count += map.get(sum - target);

            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);

    }
}












