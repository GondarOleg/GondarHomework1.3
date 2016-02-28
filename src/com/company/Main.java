package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи начало отрезка:");
        int a = scanner.nextInt();
        System.out.println("Введи конец отрезка:");
        int b = scanner.nextInt();
        System.out.println("Введи шаг:");
        int h = scanner.nextInt();
        for ( int i = a; i <= b; i+=h){
            System.out.println("Значение аргумента: " + i + " значение функции: " + ( Math.tan( 2 * i ) - 3 ) );
        }

    }
}
