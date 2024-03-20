import java.util.*;

 class firstprg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Rad : ");
        float rad = sc.nextFloat(); // take value of rad  as a input  
        float circle = 3.14f * rad * rad; 
        // here f for float, because decimal number is default to double
        System.out.println("Area of a Circle = "+ circle);
    }
}