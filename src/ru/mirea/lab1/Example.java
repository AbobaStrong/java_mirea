package ru.mirea.lab1;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // 1.33
        /*
        int len;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        len = scanner.nextInt();
        int[] array = new int[len];

        for(int i = 0; i < len; i ++){
           array[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += array[i];
        }

        System.out.println(sum);
        System.out.println(sum/len);
        */




        //1.4
        /*
        int len;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        len = scanner.nextInt();
        int[] array = new int[len];

        for(int i = 0; i < len; i ++){
            array[i] = scanner.nextInt();
        }

        int minim = array[0];
        int maxim = array[0];
        int sum = 0;
        int i = 0;

        while(i != array.length){
            sum += array[i];
            if(array[i] > maxim){
                maxim = array[i];
            }

            if(array[i] < minim){
                minim = array[i];
            }

            i ++ ;

        }

        System.out.println("Sum: " + String.valueOf(sum));
        System.out.println("Max: " + String.valueOf(maxim));
        System.out.println("Min: " + String.valueOf(minim));
        */

        //1.5
        /*
        for (String arg : args) {
            System.out.println(arg);
        }
        */


        //1.6
        /*
        float number = 0f;
        for(float i = 1; i <= 10; i++){
            number += 1/i;
            System.out.println(number);
        }
        */

        //1.7
        /*
        System.out.println(factorial(5));
        */


    }

    public static int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
