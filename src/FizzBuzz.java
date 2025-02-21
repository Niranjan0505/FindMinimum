public class FizzBuzz {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 6,  15};
        fizzBuzz(numArray);

    }
    public static void fizzBuzz(int [] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 3 == 0 && numArray[i] % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numArray[i] % 3 == 0) {
                System.out.println("Fizz");
            } else if (numArray[i] % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numArray[i]);
            }
        }

    }
}
