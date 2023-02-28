package by.itacademy.nikolaykrysiuk.javabasics;
import java.util.Scanner;
import java.sql.Array;

public class Reverse {
    public static void main(String[] args) {
        int lenght;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        lenght = sc.nextInt();
        int[] array = new int[lenght];
        System.out.println(" Введите " + lenght + " чисел");
        for(int j = 0; j<array.length;j++ ){
            array[j] = sc.nextInt();
        }
        for(int i = array.length; i > 0; i--) {
            System.out.println("Argument " + i + " = " + array[i-1]);
        }
    }
}
