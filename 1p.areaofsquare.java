import java.util.*;
class firstprg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of side : ");
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("Area of square : "+area);
    } 
}