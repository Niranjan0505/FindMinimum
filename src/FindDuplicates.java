import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] number={2,3,4,2,1,6,1};
        List<int[]> duplicates = new ArrayList<>();
        List<int[]> seen =new ArrayList<>();
        for( int num:number){
            if(seen.contains(number) && !duplicates.contains(number)){
                duplicates.add(number);
            }
            seen.add(number);
        }
    }
}
