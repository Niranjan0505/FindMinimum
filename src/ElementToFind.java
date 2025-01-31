import java.util.Arrays;

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
        if (index >= 0 && index < array.length) {
            //System.out.println("Elements from" + elementToFind +"to the first:");
            for (int i = index; i < array.length; i++) { // added '<' instead of '< '
                System.out.print(array[i]); // added semicolon at the end of the statement
            }
        } else {
            System.out.print("Element not found in the array");
        }
    }

    // sorting
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // mergesort
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, l = 0, r = 0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                array[i++] = left[l++];
            } else {
                array[i++] = right[r++];
            }
        }
        while (l < left.length) {
            array[i++] = left[l++];
        }
        while (r < right.length) {
            array[i++] = right[r++];
        }
    }


}