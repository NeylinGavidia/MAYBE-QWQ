public class Obrero extends Trabajador {

    private double jornal;
    private int diasTrabajados;

    public Obrero(String tipoDocumento, String numeroDocumento,
            String nombre, String apellidoPaterno,
            String apellidoMaterno, String direccion,
            String telefono, String fechaIngreso,
            String regimenPensionario, Area area,
            double jornal, int diasTrabajados) {

        super(tipoDocumento, numeroDocumento, nombre,
                apellidoPaterno, apellidoMaterno,
                direccion, telefono, fechaIngreso,
                regimenPensionario, area);

        this.jornal = jornal;
        this.diasTrabajados = diasTrabajados;
    }

    public double getJornal() {
        return jornal;
    }

    public void setJornal(double jornal) {

        if (jornal > 0) {
            this.jornal = jornal;
        }
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {

        if (diasTrabajados >= 0) {
            this.diasTrabajados = diasTrabajados;
        }
    }

    @Override
    public double calcularSueldo() {

        return jornal * diasTrabajados;
    }

    public double pagoPorDia() {

        return jornal;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("OBRERO");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellidoPaterno());
        System.out.println("Área: " + getArea().getNombre());
        System.out.println("Sueldo Final: " + calcularSueldo());
    }
}
