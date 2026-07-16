package basicMaths_Question;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 =input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 =input.nextInt();
        if(num2==0){
            System.out.println("GCD : "+num1);
        }
        else{
            while(num2!=0){
                int temp=num2;
                num2=num1%num2;
                num1=temp;
            }
            System.out.println("GCD : "+num1);
        }
        input.close();
    }
}
