import java.util.*;
 class firstprg{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number A: ");
          int A = sc.nextInt();
        System.out.print("Enter the number B: ");
          int B = sc.nextInt();

        if( A >B){
            System.out.println("Number A is a maximum number ");
        }else{
            System.out.println("Number B is a maximum number");
        }
    }
 }