public class swap {
    public static void swap(int a, int b) {
        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;

    }

    //func to calc sum of 2 nums
    public static int sum(int a, int b){
        return a + b;
    }

    //func to calc sum of 3 nums
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    //fun to cal float sum
    public static float sum(float a, float b) {
        return a+b;
    }
         public static void main(String args[]) {

        //swap - values exchange
        // int a = 5;
        // int b = 10;
        // swap(a, b);
 
        //multiply of two number
        int a = 3;
        int b = 5;
        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);
        prod = multiply(10, 20);
        System.out.println("a * b = " + prod);

        //factorial
        System.out.println(factorial(7));

        //binomial Cofficient
        System.out.println(binCoeff(5, 2));

        System.out.println(sum(3,5));
        System.out.println(sum(3.2f, 4.8f));
    }
}