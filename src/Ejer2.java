import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        int n;

        System.out.println("Introduce el valor de n por favor: ");
        n = scanner.nextInt();

        i = 1;

        do {

            j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j <= i);

            System.out.println();

            i++;

        } while (i <= n);

    }
}