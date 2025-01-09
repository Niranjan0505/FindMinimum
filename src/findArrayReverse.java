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
}
