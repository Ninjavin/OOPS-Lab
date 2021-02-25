import java.util.Scanner;
import java.lang.Math;
public class Armstrong{

    public static boolean armstrongNumber(int n){
        int digits = 0, num=n;
        int temp = n;
        int result = 0;
        while(temp > 0){
            temp = temp/10;
            digits++;
        }
        while(num > 0){
            int remainder = num%10;
            num = num/10;
            result = result + (int)(Math.pow(remainder, digits));
        }

        return (result==n);
        
    }

    public static void main(String args[]){
        System.out.print("Enter First Number : ");
        Scanner sc = new Scanner(System.in);
        int f1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int f2 = sc.nextInt();

        for(int i=f1 ; i<=f2 ; i++){
            if(armstrongNumber(i)){
                System.out.println(i);
            }
        }

    }
}