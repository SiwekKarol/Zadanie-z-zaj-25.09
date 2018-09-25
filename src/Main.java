import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        int suma = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        x = scan.nextInt();
        while (x * x < 100) {
            suma = suma + x;
            x = scan.nextInt();
        }
        suma = suma % 2;
        System.out.println(suma);
    }
}