package basicMaths_Question;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int value =input.nextInt();
        int original_number=value;
        int rev=0;
        while(value>0){
            int rem=value%10;
            rev=(rev*10)+rem;
            value/=10;
        }
        if(original_number == rev){
            System.out.println("The number is Palindrome");
        }
        else System.out.println("The number is not Palindrome");
        input.close();
    }
}
