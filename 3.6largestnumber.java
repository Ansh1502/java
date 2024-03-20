import java.util.*;
class largestnumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number A : ");
        int a = sc.nextInt();
        System.out.print("Enter the number B : ");
        int b = sc.nextInt();
        System.out.print("Enter the number C : ");
        int c = sc.nextInt();
 
        if ((a > b) && (a > c))
        {
                System.out.println("Number A is largest number");
           
        }
        else if (b > c)
             {
                System.out.println("Number B is largest number");
             }
        else {
            System.out.println("Number C is largest number");
        }
    }
}