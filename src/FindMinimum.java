public class FindMinimum {
    public static void main(String[] args) {
        int[] numbers={2,6,11,20,3,7,18};
        int min=numbers[0];
        for (int i=1; i < numbers.length; i++)
            if (numbers[i]<min){
                min=numbers[i];
            }

        System.out.println("The minimum value :" +min);
    }
}
