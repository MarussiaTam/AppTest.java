package lesson3;

import java.util.Scanner;

public class SquareTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите стороны треугольника:");
        System.out.println("a=");
        int a = scan.nextInt();
        System.out.println("b=");
        int b = scan.nextInt();
        System.out.println("c=");
        int c = scan.nextInt();

        System.out.println("Переметр треугольника =" + (a + b + c));
        double p = (a+b+c)/2.0;
        System.out.println("Площадь треугольника =" + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
