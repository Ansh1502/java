import java.util.*;

 class firstprg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a = sc.nextInt();   // take value of a as a input  
         System.out.print("Enter the value of B : ");
        int b = sc.nextInt();   // take value of b as a input   
        int sum = a + b;
        System.out.println("sum of A and B = "+ sum);
    }

}