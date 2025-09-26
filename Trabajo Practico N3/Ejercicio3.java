public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año inválido. No se modificó.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " de " + autor + " (" + anioPublicacion + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("El Quijote", "Cervantes", 1605);
        l1.mostrarInfo();
        l1.setAnioPublicacion(-50); // inválido
        l1.setAnioPublicacion(2005); // válido
        l1.mostrarInfo();
    }
}
