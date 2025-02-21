import java.util.ArrayList;
import java.util.List;
public class FilterName {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("elum");
        names.add("raja");
        names.add("ravi");
        List<String> filteredNames = filterNames(names);
        System.out.println(filteredNames);
        List<Double> sumthevalues = new ArrayList<>();
        sumthevalues.add(1.0);
        sumthevalues.add(2.5);
        sumthevalues.add(3.0);
        Double sum = sumUp(sumthevalues);
        System.out.println(sumUp(sumthevalues));
    }

    public static List<String> filterNames(List<String> value) {
        List<String> filteredNames = new ArrayList<>();
        for (String name : value) {
            if (name.startsWith("r")) {
                filteredNames.add(name);
            }
        }
        return filteredNames;
    }

    //problem3
    public static Double sumUp(List<Double> values) {
        List<Double> sum = new ArrayList<>();
        Double add = 0.0;
        for (Double number : values) {
            add = add + number;
            sum.add(add);
        }
        return add;
    }
}

