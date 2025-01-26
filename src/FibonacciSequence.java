public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10;
        problem2(n);
    }
        public static void problem2(int n) {
            int a=0,b=1,c=0;
            for (int i=0; i<n; i++){
                System.out.println(a+"");
                c=a+b;
                a=b;
                b=c;
            }
        }
    }



