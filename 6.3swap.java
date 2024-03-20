import java.util.*;
class interchange{
    public static void swap(int a ,int b){
        int temp = a;
          a = b;
          b = temp;
          System.out.println("new a = "+a);
          System.out.println("new b = "+b);
          
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        swap(a,b);    
    }
}      