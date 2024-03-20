import java.util.*;
 class firstprg{
    public static void main(String args[]){
    // type promotion-[1] small datatype promote as a intger in expresion.
        //char a = 'a';
        //char b = 'b';
        //System.out.println((int)a);
        //System.out.println((int)b);
        //System.out.println(a);          // take as a only a because it is not expresion
        //System.out.println(b-a);        // type promotion only in expression.
     // example 
        //short a = 5;
        //byte b = 25;
        //char c = 'c';                       // ASCII value 99
        //byte s = a+b+c;           // not posible int to byte , expresion so will be integer
        //int sum = a+b+c;            // all datatype will be in int
        //System.out.println(sum);   
    // type promotion-[2]All datatype will be converted in largest datatype in expression.
         int a = 10;
         float b = 20.25f;
         long c = 25;
         double d = 30;
         //int ans = a+b+c+d;         // not possible double to int 
         double ans = a+b+c+d;         // All datatype promote as a double 
         System.out.println(ans);
    }
 }