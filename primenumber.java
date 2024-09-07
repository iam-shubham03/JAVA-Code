import java.util.*;
public class primenumber {
    public static void main(String args[]){
      
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int num = sc.nextInt();
    

    if ( num == 2){
        System.out.println("num is prime");
    }
    else {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){  //num is a multiple of i (i not equal to 1 or n)
                isprime = false;
            }
        }
    
        if (isprime == true){
            System.out.println("num is  prime");
        }
        else{
            System.out.println(" num is not prime");
        }
    }
    
    }
}
