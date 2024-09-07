
import java.util.*;
public class age {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int age;
    System.out.println("Enter age : ");
    age = sc.nextInt();
    if(age >= 18){
        System.out.println("Adult");
    }

    if(age > 13 && age < 18) {
        System.out.println("teenager");
    }
    else {
        System.out.println("Not Adult");
    }
    }
}
