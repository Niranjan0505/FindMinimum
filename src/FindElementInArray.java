public class FindElementInArray {

    public static void main(String[] args) {
                String[]  array1 ={"1","a","3"};
        String[]  array2 = {"a","1","4","a"};
        for (String elementToFind:array2){

                boolean isfound=false;
                for (String element:array1){
                    if (element.equals(elementToFind)){
                        isfound=true;
                        break;
                    }
                }
                if (isfound){
                    System.out.println("Input"+ elementToFind + "found in the array");
                }else {
                    System.out.println("Input"+ elementToFind+ "not found in the array");
                }
            }
        }


    }
