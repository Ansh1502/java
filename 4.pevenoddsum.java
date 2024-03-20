import java.util.*;
class evenoddsum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int choice;
         int evensum=0;
         int oddsum=0;

         do{
            System.out.print("Enter the number : ");
            int num = sc.nextInt();

            if((num % 2)==0){
                evensum = evensum+num;
            }
            else{
                oddsum = oddsum+num;
            }

            System.out.print("Do you want to continue? Press 1 for yes or 0 for no !");
         
         choice = sc.nextInt();
         }while(choice ==1);
       System.out.println("sum of even numbers :"+evensum);
       System.out.println("sum of odd numbers :"+oddsum);  
    }
}