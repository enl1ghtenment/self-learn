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
            System.out.println("Индекс " + i + " -> " + numbers_2[i]);
        }

        int[] numbers_3 = {100, 200, 300};
        int sum = 0;
        for (int i = 0; i < numbers_3.length; i++) {
            sum += numbers_3[i];
        }
        System.out.println("Сумма " + sum);

        System.out.println(sumArray(numbers_3));

        int[] numbers_4 = {5, 12, 3, 20, 8};
        System.out.println(findMaxElementInArray(numbers_4));
    }
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static int findMaxElementInArray(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
}