package CheckForPrimeNumbers;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println(number+" is Not Prime");
        }else {
            int i =2;
            boolean checkNumber=true;
            while (i<=Math.sqrt(number)){
                if (number % i==0){
                    checkNumber=false;
                    break;
                }
                i++;
            }
            if (checkNumber){
                System.out.println(number+" is Prime");
            }else {
                System.out.println(number+" is NOT prime");
            }
        }
    }
}
