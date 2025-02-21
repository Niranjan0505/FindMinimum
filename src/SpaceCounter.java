public class SpaceCounter {
    public static void main(String[] args) {
        String str = "hello elumalai How are you";
        int count = countSpaces(str);
        System.out.println("Number of spaces in the string: " + count);

    }
    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
