public class ElementToFind {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
       // int elementToFind = 6;
        int index = 4;
       /* for (int i = 0; i < array.length; i++) {
            if (array[i]==elementToFind){
                index= i;
                break;
            }*/
            if (index  >= 0 && index <array.length) {
                //System.out.println("Elements from" + elementToFind +"to the first:");
                for (int i = index; i<array.length; i++) {
                    System.out.print(array[i]);
                }

            }else {
                System.out.print("Element not found in the array");
            }

        }
    }
