import java.util.*;
class factorial{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f*i;
        }
       // System.out.println("Factorial is = "+f); // method 3
        return f;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
       // System.out.println("Factorial is = "+factorial(n)); --method -1
       int fact = factorial(n);
       System.out.println("Factorial is = "+fact); //--method - 2
      //factorial(n);
   
    }
}