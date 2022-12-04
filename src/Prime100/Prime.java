package Prime100;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Show 100 Prime");
        for (int i = 2; i <= 100; i++) {
            if (i == 2) {
                System.out.println(i);
            } else {
                boolean check = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check=false;
                        break;
                    } 
                }
                if (check) {
                    System.out.println(i);
                }
            }
        }
    }
}