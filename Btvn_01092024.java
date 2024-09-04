package btvn_01092024;

import java.util.ArrayList;
import java.util.Scanner;

public class Btvn_01092024 {

    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang:");
        int n;
        n=keyboard.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Gia tri thu "+(i+1)+":");
            int value = keyboard.nextInt();
            numbers.add(value);
        }
        return numbers;
    }
    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.print("Cac phan tu trong mang:");
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i)+" ");
        }
    }
    public static int findMax2(ArrayList<Integer> numbers) {
        int max1=0;
        int max2=0;
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)>max1){
                max1=numbers.get(i);
            }
        }
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)>max2 && numbers.get(i)!=max1){
                max2=numbers.get(i);
            }
        }
        System.out.print("So lon thu 2 trong mang la:"+max2);
        return max2;
    }
    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2!=0){
                numbers.remove(i);
            }
        }
        System.out.print("Mang sau khi xoa phan tu le:");
        for(int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String result = null;
        do{
            System.out.println("1.EnterData:");
            System.out.println("2.DisplayData:");
            System.out.println("3.findMax2:");
            System.out.println("4.deleteOddNumber:");
            int select = keyboard.nextInt();
            switch(select){
                case 1:
                    EnterData(numbers);
                    break;
                case 2:
                    DisplayData(numbers);
                    break;
                case 3:
                    findMax2(numbers);
                    break;
                case 4:
                    deleteOddNumber(numbers);
                    break;
                default:
                    System.out.print("Error!!!");
                    break;
            }
            System.out.println("Ban co muon tiep tuc?(Y/N):");
            result = keyboard.next();
        } while(result.equals("y"));
    }
}