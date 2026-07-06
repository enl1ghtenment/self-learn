package org.enlightenment;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        /*numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;
        numbers[5] = 30;*/

        int number = 5;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = number;
            number+=5;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Первый элемент: " + numbers[0]);
        System.out.println("Третий элемент: " + numbers[2]);
        System.out.println("Последний элемент: " + numbers[5]);

        numbers[1] = 100;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] numbers_2 = {2, 4, 6, 8, 10, 12};
        for (int i = 0; i < numbers_2.length; i++) {
            System.out.println("Индекс + " + i + " -> " + numbers_2[i]);
        }

    }
}