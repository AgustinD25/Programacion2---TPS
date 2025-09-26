import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scan.next().toUpperCase().charAt(0);

        double descuento = 0;

        if (categoria == 'A') {
            descuento = 0.10;
        } else if (categoria == 'B') {
            descuento = 0.15;
        } else if (categoria == 'C') {
            descuento = 0.20;
        } else {
            System.out.println("Categoría inválida.");
            return; // corta el programa si la categoría no es válida
        }

        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
