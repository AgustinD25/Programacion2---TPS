import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = scan.nextInt();

        // Un año es bisiesto si es divisible por 4 y no por 100,
        // salvo que también sea divisible por 400.
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
}
