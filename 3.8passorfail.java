import java.util.*;
class passorfail {
    public static void main(String args[]){
        System.out.print("Enter marks : ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String type = (marks >= 33) ? "student is PASS !" : "student is FAIL !";
        System.out.println(type); 
    }
}