package by.itacademy.nikolaykrysiuk.javabasics;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя ");
        String name = sc.nextLine();
        System.out.printf("Hello, %s",name);
    }
}
