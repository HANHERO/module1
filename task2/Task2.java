package task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(hodKonya(0, 0, 1, 2));
    }

    public static String hodKonya(int x, int y, int a, int b) {
        if ((Math.pow(a - x, 2) + Math.pow(b - y, 2))==5) {
            return "Конь может так пойти";
        } else return "Конь не можеь так пойти";
    }
}
