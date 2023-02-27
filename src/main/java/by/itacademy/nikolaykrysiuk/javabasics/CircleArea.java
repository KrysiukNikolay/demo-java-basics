package by.itacademy.nikolaykrysiuk.javabasics;
import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, area;
        radius = sc.nextDouble();
        area = Math.pow(radius, 2) * Math.PI;
        System.out.printf("Площадь круга радиусом %f = %f", radius, area);

    }
}
