package com.company;

// Задание 6
public class Task6 {
    public static void main(String[] args) {

        int[] array = {2, 2, 2, 1, 2, 2, 10, 1};
        int sumRight=0;
        int sumLeft = 0;

        for (int i = 0; i < array.length-2; i++) {
            sumLeft += array[i];
        }
            System.out.println("Сумма значений левой стороны массива равна " + sumLeft);

        for (int i = 0; i < array.length; i++) {
            sumRight = array[array.length-2] + array[array.length-1];
        }
            System.out.println("Сумма значений правой стороны массива равна " + sumRight);

        System.out.println("Результат сравнения - " + checkBalance(sumRight, sumLeft));


    }

    public static boolean checkBalance(int sumRight, int sumLeft) {
        if (sumRight == sumLeft) {
            return true;
        } else {
            return false;
        }

    }


}



