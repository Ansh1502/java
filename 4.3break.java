import java.util.*;
class anshbreak{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
       System.out.println("This is multiple of 10 !!"); 
    }
}