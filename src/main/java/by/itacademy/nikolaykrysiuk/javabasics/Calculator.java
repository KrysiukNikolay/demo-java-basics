package by.itacademy.nikolaykrysiuk.javabasics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numOne, numTwo;
        System.out.println("Введите первое число:");
        numOne = sc.nextDouble();
        System.out.println("Введите второе число:");
        numTwo = sc.nextDouble();
        System.out.println("Введите действие +-*/:");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(numOne + numTwo);
                break;
            case '-':
                System.out.println(numOne - numTwo);
                break;
            case '*':
                System.out.println(numOne * numTwo);
                break;
            case '/':
                System.out.println(numOne / numTwo);
                break;
        }

    }
}
