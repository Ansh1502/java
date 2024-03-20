import java.util.*;
  class firstprg{
    public static void main(String args[]){

     Scanner sc = new Scanner(System.in); 
      System.out.print("Enter the value of A : ");
      int A = sc.nextInt();
      System.out.print("Enter the value of B : ");
      int B = sc.nextInt();
      System.out.print("Enter the value of C : ");     
      int C = sc.nextInt();
      float avg  = (A+B+C)/3;
      System.out.println("Avg of three number : " +avg);
    }
 }
