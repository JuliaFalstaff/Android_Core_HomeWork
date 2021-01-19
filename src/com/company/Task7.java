package com.company;

public class Task7 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int n;
        n = 1; //шаг сдвига
        /*for (int i = 0; i < arr.length; i++) {
            if (n >0) {
                arr[i] = arr[i + n];
                arr[arr.length-1] = arr[0];
            } else if (n < 0) {
                arr[i] = arr[i - n];
                arr[0] = arr[arr.length + 1];
            }*/


       if (n >0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i + n];
                arr[arr.length-1] = arr[0];
                System.out.println(arr[i]);
            }

        }

       /* if (n < 0) {
            for (int i = 0; i < arr.length; i--) {
                arr[i] = arr[i - n];
                arr[0] = arr[arr.length - 1];
                System.out.println(arr[i]);
        }



        }*/





        }



    }


