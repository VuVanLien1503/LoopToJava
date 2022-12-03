package HienThiCacLoaiHinh;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != -0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw Rectangle");
                    System.out.println("Weight- Rectangle");
                    int weight = scanner.nextInt();
                    System.out.println("Height- Rectangle");
                    int height = scanner.nextInt();
                    if (weight > 0 && height > weight) {
                        for (int i = 0; i < weight; i++) {
                            for (int j = 0; j < height; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        break;
                    }
                case 2:
                    int menu = -1;
                    while (menu != 0) {
                        System.out.println("Menu:");
                        System.out.println("1. square triangle:Top-left:");
                        System.out.println("2. square triangle-bottom-left:");
                        System.out.println("3. square triangle-Top-Right:");
                        System.out.println("0. Exit:");
                        menu = scanner.nextInt();
                        switch (menu) {
                            case 1:
                                System.out.println("square triangle:Top-left");
                                for (int i = 0; i <= 5; i++) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            case 2:
                                System.out.println("square triangle-bottom-left:");
                                for (int i = 7; i >= 1; i--) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            case 3:
                                System.out.println("square triangle-Top-right");
                           
                                break;
                            default:
                                System.out.println("No Menu");
                        }
                    }
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}
