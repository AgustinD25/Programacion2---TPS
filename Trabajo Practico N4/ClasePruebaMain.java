public class Main {
    public static void main(String[] args) {
        // Crear empleados con ambos constructores
        Empleado e1 = new Empleado(101, "Ana López", "Analista", 75000);
        Empleado e2 = new Empleado("Luis Pérez", "Programador");
        Empleado e3 = new Empleado("Carla Gómez", "Diseñadora");

        // Aplicar aumentos
        e2.actualizarSalario(10);   // aumento del 10%
        e3.actualizarSalario(5000); // aumento fijo

        // Mostrar información de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
