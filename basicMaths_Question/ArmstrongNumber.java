package basicMaths_Question;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int value =input.nextInt();
        int original_number=value,temp=value;
        int count=0,rem,armstrong=0;
        while(value > 0){
            count++;
            value/=10;
        }
        while(temp>0){
            rem=temp%10;
            armstrong += (int)Math.pow(rem,count);
            temp/=10;
        }
        if(original_number==armstrong){
            System.out.println("Armstrong : "+original_number);
        }
        else System.out.println("Not Armstrong : "+original_number);
        input.close();
    }
    
}
