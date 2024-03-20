/*import java.util.*;
class sumfunction{
    public static void calculatesum(int num1,int num2){
        int sum = num1+num2;
        System.out.println("sum of the number is = "+sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter a value of b : ");
        int b = sc.nextInt();
        calculatesum(a,b);
    }
}*/
import java.util.*;
class sumfunction{
    public static int calculatesum(int num1,int num2){ //parameters or formal parameters
        int sum = num1+num2;
       return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter a value of b : ");
        int b = sc.nextInt();
        int sum = calculatesum(a,b);    //arguments or actual parameters
        System.out.println("sum of the number is = "+sum);
    }
}