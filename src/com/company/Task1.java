package com.company;

public class Task1 {

    public static void main(String[] args) {

        //задание 1: С помощью цикла и условия заменить 0 на 1, 1 на 0
	    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
	    for (int i =  0; i < arr.length; i++) {
	        if (arr[i] == 0) {
	            arr[i] = 1;
            } else {
	            arr[i] =0;
            }
            System.out.println(arr[i]);
        }



    }
}
