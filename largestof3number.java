public class largestof3number {
    public static void main(String args[]) {
     int A,B,C;
     A = 9; B = 16; C = 4;

     if((A >= B)  &&  (A >= C)){
        System.out.println("Largest number is : " + A);
     }
     else if (B >= C) {
        System.out.println("Largest number is :"+B);
     }
     else {
        System.out.println("Largest number is :"+C);
     }
    }
}
