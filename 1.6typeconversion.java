import java.util.*;

 class firstprg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      
        //int number = sc.nextFloat();      // not possible because float ->int, [float>>int]
        
        float number  = sc.nextInt();       // possible because int -> float,[float>>int]
        System.out.println(number);
    }
 }   