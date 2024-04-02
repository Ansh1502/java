import java.util.*;
class primesInrang{
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
    public static void primesInrange(int n){
        for(int i =2;i<n;i++){
            if(isprime(i)== true){
                System.out.print (i+" "); 
            }
            
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        primesInrange(n);
    }
}   