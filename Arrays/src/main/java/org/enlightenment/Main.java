package org.enlightenment;

import javax.sound.midi.Soundbank;

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

        int[] numbers_5 = {2, 100, 6, 8, 10};
        System.out.println("Среднее значение " + average(numbers_5));
        System.out.println("Индекс максимального значения " + findMaxIndex(numbers_5));
        int[] numbers_6 = {3, 6, 9, 12};
        increaseArrayNumbersByOne(numbers_6);
        for (int i = 0; i < numbers_6.length; i++) {
            System.out.println(numbers_6[i]);
        }
        int[] numbers_7 = {5, -2, 8, -7, 10};
        changeNegativeToZero(numbers_7);
        for (int i = 0; i < numbers_7.length; i++) {
            System.out.println(numbers_7[i]);
        }
        int[] numbers_8 = {2, 4, 6, 8};
        multiplyByTwo(numbers_8);
        for (int i = 0; i < numbers_8.length; i++) {
            System.out.println(numbers_8[i]);
        }
        doubleElements(numbers_8);
        for (int i = 0; i < numbers_8.length; i++) {
            System.out.println(numbers_8[i]);
        }

        int[][] doubleArray = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(doubleArray[1][1]);
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
    public static int countEvenNumbers(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int countNumbersBiggerThanTwenty(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 20) {
                count++;
            }
        }
        return count;
    }
    public static int countGreaterThanTen(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                count++;
            }
        }
        return count;
    }
    public static double average(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return (double) sum / numbers.length;
    }
    public static boolean contains(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return true;
            }
        }
        return false;
    }
    public static int findIndex(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int findMaxIndex(int[] numbers) {
        int max = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        return index;
    }
    public static int findMinIndex(int[] numbers) {
        int min = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                index = i;
            }
        }
        return index;
    }
   public static void increaseArrayNumbersByOne(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 1;
        }
    }
    public static void changeNegativeToZero(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
        }
    }
    public static void multiplyByTwo(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
    }
    public static void doubleElements(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
    }
}