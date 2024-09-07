import java.util.*;

public class largestof2number {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int  A, b;
    System.out.println("Enter value of A :");
    A = sc.nextInt();
    System.out.println("Enter value of B :");
    b = sc.nextInt();

    if (A>=b) {
        System.out.println("A is largest of 2");
    }
    else {
        System.out.println("B is largest of 2");
    }
    }
}
