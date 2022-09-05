package lesson4;

public class Triangle {
    public Triangle(int testInt) {
    }

    public Triangle() {
    }

    public boolean isTriangle(int a, int b, int c) {

        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Такого треугольника не существует");
            return false;
        }

            double p = (a+b+c)/2.0;
            System.out.println("Площадь треугольника =" + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
            return true;
    }

}
