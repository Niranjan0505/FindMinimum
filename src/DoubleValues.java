import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleValues {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 5);
        List<Integer> result =doubleValues(input);
        System.out.println(result);
    }

    public static List<Integer> doubleValues(List<Integer> values) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            int value = values.get(i) * 2;
            result.add(value);
        }
        return result;
    }
}


