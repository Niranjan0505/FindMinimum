import java.util.ArrayList;
import java.util.List;
public class MinAndMax {
    public static void main(String[] args) {
        int[] array = {2, 6, 11, 20, 3, 7, 18};
        int pivotalValue = 10;
        List<Integer> minArray = new ArrayList<>();
        List<Integer> maxArray = new ArrayList<>();
        for (int value : array) {
            if (value<=pivotalValue){
                minArray.add(value);
            }else {
                maxArray.add(value);
            }


            System.out.println("Min array:" +minArray);
            System.out.println("Max array:" +maxArray);
        }
    }
}