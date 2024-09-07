import java.util.*;
public class Avgofthreenum {
    public static float Avg(int a, int b, int c){
        int sum = a + b + c;
        float Avg = sum/3;
        return Avg;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Avg of three number is : ");
        System.out.println(Avg(4, 5, 6));
    }
}
