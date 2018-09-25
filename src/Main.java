import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double x = 0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbę a");
            a = scan.nextDouble();
        } while (a == 0);
        System.out.println("Podaj liczbę b");
        b = scan.nextDouble();
        System.out.println("Podaj liczbę c");
        c = scan.nextDouble();

        x = (c - b) / a;
        System.out.println(x);
    }
}