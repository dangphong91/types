import java.util.Scanner;

public class Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Choice:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i<=3; i++) {
                    for (int j = 1; j <=7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Different Angles:");
                System.out.println("1. Top-left");
                System.out.println("2. Top-Right");
                System.out.println("3. Bottom-Left");
                System.out.println("4. Bottom-Right");
                int choiceAngles = scanner.nextInt();
                switch (choiceAngles) {
                    case 1:
                        for (int i = 5; i>=1; i--) {
                            for (int j = i; j >=1; j--) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        for (int i = 5; i>=1; i--) {
                            for (int j = 1; j<= 5-i; j++){
                                System.out.print(" ");
                            }
                            for (int k = i; k>=1; k--) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        for (int i = 1; i<=5; i++) {
                            for (int j = 1; j<=i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 4:
                        for (int i = 1; i<=5; i++) {
                            for (int j = 5-i; j >=1; j--) {
                                System.out.print(" ");
                            }
                            for (int k = 1; k<=i; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                }
                break;
            case 3:
                for (int i =1; i<=5; i++) {
                    for (int j = 5-i; j>=1; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <=i*2-1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Chưa có");
        }
    }
}
