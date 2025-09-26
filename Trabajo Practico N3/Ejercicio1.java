public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(int puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.nombre = "Lucía";
        e1.apellido = "Gómez";
        e1.curso = "Programación II";
        e1.calificacion = 7;

        e1.mostrarInfo();
        e1.subirCalificacion(2);
        e1.bajarCalificacion(1);
        e1.mostrarInfo();
    }
}
