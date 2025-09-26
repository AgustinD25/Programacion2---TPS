public class Mascota {
    String nombre;
    String especie;
    int edad;

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.nombre = "Toby";
        m1.especie = "Perro";
        m1.edad = 3;

        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();
    }
}
