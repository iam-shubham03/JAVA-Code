import java.util.*;

public class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter a number :");
        number = sc.nextInt();
        // if(number % 2 == 0){
        //     System.out.println("Number is Even");
        // }
        // else {
        //     System.out.println("Number is Odd");
        // }

        //ternary operator
    String type = ((number%2) == 0)? "Even" : "Odd";  
    System.out.println(type); 
    }

     
}
