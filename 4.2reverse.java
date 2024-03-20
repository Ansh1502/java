import java.util.*;
 class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int lastdigit;
        int rev=0;
        System.out.print("reverse number is : ");
        while(n>0)
        {
            lastdigit = n%10;
            rev = rev * 10 + lastdigit;
            //System.out.print(lastdigit);
            n =n/10;
        }
        System.out.println(rev);
    }
}