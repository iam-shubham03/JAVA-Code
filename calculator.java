import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A :");
        int A = sc.nextInt();
        System.out.println("Enter number B :");
        int B = sc.nextInt();
        System.out.println("Enter operator :");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(A+B);
                break;
            case '-' : System.out.println(A-B);
                break;
            case '*' : System.out.println(A*B);
                break;
            case '/' : System.out.println(A/B);
                break; 
            default : System.out.println("Wrong operator");
        }
    }
}
