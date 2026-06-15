package Numbers_Question;
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number");
        int num = input.nextInt();
        boolean isPrime=true;
        if(num == 1){
            System.out.print("1 is neither prime nor composite number");
            return;
            
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime = false;
            }
        }    
        if(isPrime){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
        input.close();
    }
}