import java.util.ArrayList;

public class MissingNumber {
    public static void main(String[] args) {
        int[] number = {1,3,6};
        int min = number[0];
        int max = number[0];
        for (int num:number){
            if (num < min) min=num;
            if (num > max) max=num;
        }
        ArrayList <Integer> missingNumber = new ArrayList<>();
        for ( int i=min; i<=max;i++){
            boolean found = false;
            for (int num:number){
                if (num==i){
                    found =true;
                    break;
                }
            }
            if (!found){
                missingNumber.add(i);
            }
        }
        System.out.println("missingNumber:" + missingNumber);

    }
}
