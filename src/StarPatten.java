public class StarPatten {
    public static void main(String[] args) {
        int n=5;
        problem9(n);
}
public static void problem9(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}