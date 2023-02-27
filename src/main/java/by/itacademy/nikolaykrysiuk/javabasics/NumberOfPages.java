package by.itacademy.nikolaykrysiuk.javabasics;

import java.util.Scanner;
public class NumberOfPages {
    public static void main(String[] args) {
        int numbers, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество новостей ");
        numbers = sc.nextInt();
        if(numbers < 10){
            System.out.println("Данное количество новостей помещается на одной странице");
        }else {
            total = numbers / 10;
            System.out.println("Для данного количства новостей необходимо: " + (total + 1) + " страниц");
        }
    }
}
