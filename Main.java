

import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Scanner check = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во элементов в базе данных: ");
        int size = input.nextInt();
        String array[] = new String[size + 1];
        System.out.println("Введите Информацию товара:");

        for (int i = 0; i <= size; i++) {
            array[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(array));
    }
}