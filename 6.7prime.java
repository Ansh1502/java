import java.util.*;
class prime{
    public static boolean isprime(int n){
       boolean isprime = true;
        for(int i=2;i<n-1;i++){
            if(n % i == 0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
       // System.out.println(isprime(n));
         if(isprime(n) == true){
            System.out.println("Entered number is prime !!");
            }
            else{
            System.out.println("Entered number is not prime !!");
            }
       
    }
}