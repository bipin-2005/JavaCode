package Numbers_Question;
import java.util.Scanner;
public class InverseNumber{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        int inverse=0,position=1;
        while(num!=0){
            int original_digit = num%10;
            int inverse_digit = position;
            int inverse_position = original_digit;

            inverse = inverse + inverse_digit * (int)Math.pow(10,inverse_position-1);

            num/=10;
            position++;
        }
        System.out.print("Inverse number is : "+inverse);
        input.close();
    }
}