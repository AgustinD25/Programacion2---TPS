

import java.util.Scanner;
public class ErrorEjemplo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); // corregimos el scanner por input
String nombre; //esto se lo agregue

System.out.print("Ingresa tu nombre: ");
nombre = input.nextLine(); //esto lo agregue 

String nombre = scanner.nextInt(); // ERROR // Esto lo borramos

System.out.println("Hola, " + nombre);
}
}