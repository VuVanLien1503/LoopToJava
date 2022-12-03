package TinhLaiVay;

import java.util.Scanner;

public class CalculateLoanInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Money");
        double money=scanner.nextDouble();
        System.out.println(" Enter Month");
        int month=scanner.nextInt();
        System.out.println("Enter InterestRate ");
        double interestRate=scanner.nextDouble();
        double result=0;
        for (int i = 0; i < month; i++) {
            result += money *(interestRate/100)/12*money;
        }
        System.out.println("Total of interest: " + result);
    }
}
