import java.util.*;

 class firstprg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the float value a: ");
        float a = sc.nextFloat();
       //  int b = a;       //not possible
        int b =(int)a;
        System.out.println("integer value a : "+b);
    }
}        