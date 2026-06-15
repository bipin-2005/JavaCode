package Numbers_Question;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your number : ");
        int num = input.nextInt();
        int count =0;
        int temp=num,sum=0,originalNum=num;;
        while(num>0){
            num/=10;
            count++;
        }
        while(temp>0){
            int rem = temp%10;
            sum+=Math.pow(rem,count);
            temp/=10;
        }
        if(sum == originalNum){
            System.out.println(originalNum+" is a Armstrong number");
        }
        else System.out.println(originalNum+" is not a Armsteong number");
        input.close();
    }
}
