package by.itacademy.nikolaykrysiuk.javabasics;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        double a, b, c;
        double D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a, b, c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
           double x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
