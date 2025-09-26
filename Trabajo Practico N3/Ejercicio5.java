public class NaveEspacial {
    String nombre;
    int combustible;
    final int MAX_COMBUSTIBLE = 100;

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2; // 2 unidades por cada unidad de distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= MAX_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        } else {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("El tanque se llenó al máximo (" + MAX_COMBUSTIBLE + ").");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible actual: " + combustible);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Explorer I";
        nave.combustible = 50;

        nave.mostrarEstado();
        nave.avanzar(20); // debería fallar por falta de combustible
        nave.recargarCombustible(40);
        nave.despegar();
        nave.avanzar(15);
        nave.mostrarEstado();
    }
}
