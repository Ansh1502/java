import java.util.*;
class ternary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        
       String type = ((num % 2) == 0) ? "Entered number is even !":"Entered number is odd !";
       System.out.println(type);
    }
}