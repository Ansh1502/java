import java.util.*;
 class firstprg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of pencil : ");
        float pencil = sc.nextFloat();
System.out.print("Enter the value of pen : ");
        float pen = sc.nextFloat();
System.out.print("Enter the value of eraser : ");                float eraser = sc.nextFloat();   
        float total = pencil+pen+eraser;
        System.out.println("Bill is : "+total);
        float newtotal = total + (0.18f * total);   
        System.out.println("Bill with 18% GST : "+newtotal);  
    } 
 }