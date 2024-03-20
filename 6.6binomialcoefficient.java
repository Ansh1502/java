import java.util.*;
class binomial{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f*i;
        }
        return f ;
    }
    public static int bincoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n/(fact_r * fact_nmr);
        return bincoeff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        int b= bincoeff(n,r);
        System.out.println("binomial coefficient is = "+b);
        //System.out.println("binomial coefficient is = "+bincoeff(n,r));
     
    }
    
}