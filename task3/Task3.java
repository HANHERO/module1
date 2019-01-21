package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Double x1, y1, x2, y2, x3, y3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты точки А: ");
        System.out.print("Ax = ");
        x1 = Double.parseDouble(br.readLine());
        System.out.print("Ay = ");
        y1 = Double.parseDouble(br.readLine());
        System.out.println("Введите координаты точки B: ");
        System.out.print("Bx = ");
        x2 = Double.parseDouble(br.readLine());
        System.out.print("By = ");
        y2 = Double.parseDouble(br.readLine());
        System.out.println("Введите координаты точки C: ");
        System.out.print("Cx = ");
        x3 = Double.parseDouble(br.readLine());
        System.out.print("Cy = ");
        y3 = Double.parseDouble(br.readLine());
        calcul(x1, y1, x2, y2, x3, y3);
    }
    public static void calcul(double x1,double y1,double x2,double y2,double x3,double y3){
            Double odnaVtoraya = 0.5;
        System.out.println("Площадь треугольника: " + odnaVtoraya*(Math.abs(((x1-x3)*(y2-y3))-((x2-x3)*(y1-y3)))));
    }
}
