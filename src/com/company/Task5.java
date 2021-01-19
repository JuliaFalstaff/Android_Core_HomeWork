package com.company;

public class Task5 {

    //задание 5: Задать одномерный массив и найти в нем минимальный и максимальный элементы

    public static void main(String[] args) {
        int[] arr = {2, 15, 32, 8, 3, 14, 7, 5};
        int maxNumber = arr[0];
        int minNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }

         }
        System.out.println("Минимальное значение в массиве " + minNumber);
        System.out.println("Максимальное значение в массиве " + maxNumber);

        // Вариант решения 2: с таким вариантом тоже работает - else if
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            } else if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }

        }
        System.out.println("Минимальное значение в массиве " + minNumber);
        System.out.println("Максимальное значение в массиве " + maxNumber);


    }






}
