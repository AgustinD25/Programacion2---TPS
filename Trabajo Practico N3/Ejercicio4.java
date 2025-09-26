public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        g1.edad = 2;
        g1.huevosPuestos = 5;

        Gallina g2 = new Gallina();
        g2.idGallina = 2;
        g2.edad = 1;
        g2.huevosPuestos = 0;

        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.envejecer();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
