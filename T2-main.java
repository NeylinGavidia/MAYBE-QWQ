public class Main {

    public static void main(String[] args) {

        Area area1 = new Area("A01",
                "Recursos Humanos", null);

        Area area2 = new Area("A02",
                "Limpieza", area1);

        // UPCASTING
        Trabajador t1 = new Empleado(
                "DNI",
                "12345678",
                "Carlos",
                "Lopez",
                "Diaz",
                "Av Perú",
                "987654321",
                "10/03/2020",
                "Prima",
                area1,
                3000,
                2
        );

        Trabajador t2 = new Obrero(
                "DNI",
                "87654321",
                "Juan",
                "Perez",
                "Rojas",
                "Jr Lima",
                "999888777",
                "15/05/2021",
                "ONP",
                area2,
                80,
                25
        );

        // POLIMORFISMO
        t1.mostrarDatos();
        System.out.println();

        t2.mostrarDatos();

        System.out.println();

        // DOWNCASTING

        if (t1 instanceof Empleado) {

            Empleado e = (Empleado) t1;

            System.out.println("Pago por día empleado: "
                    + e.pagoPorDia());
        }

        if (t2 instanceof Obrero) {

            Obrero o = (Obrero) t2;

            System.out.println("Pago por día obrero: "
                    + o.pagoPorDia());
        }

        System.out.println();

        // CAMBIO DE ÁREA
        t2.setArea(area1);

        System.out.println("Nueva área obrero: "
                + t2.getArea().getNombre());

        System.out.println();

        // MES Y AÑO DE INGRESO

        System.out.println("Fecha ingreso trabajador:");
        System.out.println(t1.getFechaIngreso());
    }
}
