import java.util.*;
class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean isprime = true;

        if(n == 2){
            System.out.println("2 is a prime number !!");
        }
        else{
            for(int i = 2 ;i<=Math.sqrt(n);i++){
                if (n % i == 0){
                isprime = false;
               }
            }
            if(isprime == true){
            System.out.println("Entered number is prime !!");
            }
            else{
            System.out.println("Entered number is not prime !!");
            }
        }  
  }
}