package Show20Prime;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Number-Prime-Show");
        int count=0;
        int prime=2;
        int number=scanner.nextInt();
        while (count!=number){
            for (int i=2; i <=prime ; ) {
                if (prime%i==0){
                    i++;
                    prime++;
                    break;
                }else {
                    System.out.println(prime);
                    count++;
                    i++;
                    prime++;
                    break;
                }
            }
        }

    }
}
