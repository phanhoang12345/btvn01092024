package btvn1092024;

import java.util.ArrayList;
import java.util.Scanner;

public class Btvn1092024 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. nhap du lieu");
            System.out.println("2. in du lieu");
            System.out.println("3. tim gia tri lon thu hai");
            System.out.println("4. xoa cac so le");
            System.out.println("5. Thoat");
            System.out.print("Lua Chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    numbers = NumberExercise.enterData(numbers);
                    break;
                case 2:
                    NumberExercise.printData(numbers);
                    break;
                case 3:
                    int max2 = NumberExercise.findMax2(numbers);
                    if (max2 != Integer.MIN_VALUE) {
                        System.out.println("Gia tri lon thu hai: " + max2);
                    }
                    break;
                case 4:
                    NumberExercise.deleteOddNumber(numbers);
                    break;
                case 5:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Errors.");
            }

        } while (choice != 5);
    }
}
