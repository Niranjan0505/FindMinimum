public class StringValueFind {
    public static void main(String[] args){
            String[]  array={"1","a","3"};
            String target ="a";
            boolean isfound=false;
            for (String input:array){
                if (input.equals(target)){
                    isfound=true;
                    break;
                }
            }
            if (isfound){
                System.out.println("Input"+ target + "found in the array");
            }else {
                System.out.println("Input"+ target + "not found in the array");
            }
    }
}


