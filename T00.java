// Dian Petrus Panjaitan Nim 12S25057
// Julia Simatupang Nim 12S25020
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("Bilangan pertama genap");
        } else {
            System.out.println("Bilangan pertama ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("bilangan kedua genap");
        } else {
            System.out.println("Bilangan kedua ganjil");
        }
        if (a > b) {
            System.out.println("bilangan pertama lebih besar");
        } else {
            if (b < a) {
                System.out.println("Bilangan sama  lebih besar");
            } else {
                System.out.println(" bilangan kedua lebih besar");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            a = a + b;
            System.out.println(" hasil penjumlahan " + a);
        } else {
            if (a % 2 == 1 && b % 2 == 1) {
                a = a * b;
                System.out.println("Hasil penjumlahan" + a);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}
