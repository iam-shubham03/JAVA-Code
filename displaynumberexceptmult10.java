import java.util.*;
public class displaynumberexceptmult10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    //     do{
    //     System.out.println("Enter a number :");
    //     int num = sc.nextInt();

    //     if(num % 10 == 0) {
    //         continue;
    //     }
    //     System.out.println("Number was :"+ num);
    // }
    // while(true);



                //Keeoentering number till user enter a multiple of 10



    do {
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if(num % 10 == 0){
            break;
        }
        System.out.println("Number was :"+num);
    }
    while(true);

}
}
