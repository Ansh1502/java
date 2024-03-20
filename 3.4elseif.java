import java.util.*;
   class firstprg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("you are adult !");
        }
        else if(age >= 13 && age <=18 )
        {
            System.out.println("you are a teenager !");
        }
        else{
            System.out.println("you are children !");
        }
    }
  }