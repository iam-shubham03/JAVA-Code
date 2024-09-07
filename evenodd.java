import java.util.*;
public class evenodd {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int testnum = 43;
        if (isEven(testnum)) {
            System.out.println(testnum + " is even");
        }
        else {
            System.out.println(testnum + " is not even");
        }
   
    }
}
