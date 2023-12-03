import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean suspendido = false;
        double calificacion;


        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la nota del alumno " + i + ": ");
            calificacion = leer.nextDouble();



            if (calificacion < 1 || calificacion > 10) {
                System.out.println("Lo siento, la nota no es correcta");
                i--;

                continue;
            }

            if (calificacion < 5) {
                suspendido = true;
                break;

            }
        }

        if (suspendido) {
            System.out.println("Hay algunos suspensos");

        } else {

            System.out.println("No existen suspensos");
        }

    }
}