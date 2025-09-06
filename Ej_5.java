/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_5;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class Ej_5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1,num2, suma, resta, multiplicacion, division;
        num1= 0;
        num2= 0;
        
        System.out.println("Ingresá el primer número: ");
        num1= Integer.parseInt(input.nextLine());
        System.out.println("Ingresa el segundo número: ");
        num2= Integer.parseInt(input.nextLine());
        
        suma= num1 + num2;
        resta= num1 - num2;
        multiplicacion= num1 * num2;
        division= num1 / num2;
        
        System.out.println("El resultado de la suma de los numeros es: " + suma);
        System.out.println("El resultado de la resta de los numeros es: " + resta);
        System.out.println("El resultado de la multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("El resultado de la division de los numeros es: " + division);
    
    }
    
}
