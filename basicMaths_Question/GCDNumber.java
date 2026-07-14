/*Brute Force Approach*/
package basicMaths_Question;
import java.util.Scanner;
public class GCDNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 =input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 =input.nextInt();
        int min=Math.min(num1,num2);
        for(int i=min ;i>=1;i--){
            if(num1%i==0 && num2%i==0){
                System.out.println("GCD : "+i);
                return;
            }
        }
    }  
}
