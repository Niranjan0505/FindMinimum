import java.util.ArrayList;

public class findUniqueNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,1,6,1};
        ArrayList<Integer> uniqueNumbers = findUniqueNumbers(arr);
        System.out.println("Unique Number:" +uniqueNumbers);
    }
}
public static ArrayList<Integer>findUniqueNumbers(int[] arr){
    ArrayList<Integer>uniqueList=new ArrayList<Integer>();
    for ( int i=0; i< arr.length; i++){
        boolean isUnique = true;
        for (int j=0; j< arr.length; j++){
            if (arr[i] == arr[j] && i!=j){
                isUnique=false;
                break;
            }
        }
        if (isUnique){
            uniqueList.add(arr[i]);

        }
    }
    return uniqueList;

}

public void main() {
}


