package by.itacademy.nikolaykrysiuk.javabasics;
public class Reverse {
    public static void main(String[] args) {
        for(int i = args.length; i >= 0; i--) {
            System.out.println("Argument " + i + " = " + args[i-1]);
        }
    }
}
