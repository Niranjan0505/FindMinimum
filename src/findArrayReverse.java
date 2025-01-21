import java.util.Scanner;

public class findArrayReverse {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50,60,70};
        int index=4;
        if (index >= 0 && index < array.length){
            for ( int i= index; i>=0; i--){
                System.out.println(array[i]);
            }
        }else{
            System.out.println("Index is not bound");
        }

    }

    public static class StringInInput {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            String[] inputs =new String[3];
            String target="a";
            System.out.println("Enter three string:");
        for (int i = 0; i < 3; i++ ){
                System.out.println("Input"+(i+1)+":");
                inputs[i]= scanner.nextLine();
            }
            boolean found=false;
        for (String input:inputs){
                if (input.equals(target)){
                    found=true;
                    break;
                }
            }

        if(found) {
                System.out.println("The target string "+target+" was found");
            }else{
                System.out.println("The target string " +target+"  not found");
            }
            scanner.close();

        }
    }
}
