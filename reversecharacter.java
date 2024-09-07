import java.util.*;
public class reversecharacter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many line print :");
        int n = sc.nextInt();
        char ch ='A';
        for(int line=1; line<=n; line++){
            for(int chars = 1; chars<=n-line+1; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
