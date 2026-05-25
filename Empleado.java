public class Empleado extends Trabajador {

    private double sueldoMensual;
    private int diasNoAsistidos;

    public Empleado(String tipoDocumento, String numeroDocumento,
            String nombre, String apellidoPaterno,
            String apellidoMaterno, String direccion,
            String telefono, String fechaIngreso,
            String regimenPensionario, Area area,
            double sueldoMensual, int diasNoAsistidos) {

        super(tipoDocumento, numeroDocumento, nombre,
                apellidoPaterno, apellidoMaterno,
                direccion, telefono, fechaIngreso,
                regimenPensionario, area);

        this.sueldoMensual = sueldoMensual;
        this.diasNoAsistidos = diasNoAsistidos;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {

        if (sueldoMensual > 0) {
            this.sueldoMensual = sueldoMensual;
        }
    }

    public int getDiasNoAsistidos() {
        return diasNoAsistidos;
    }

    public void setDiasNoAsistidos(int diasNoAsistidos) {

        if (diasNoAsistidos >= 0) {
            this.diasNoAsistidos = diasNoAsistidos;
        }
    }

    @Override
    public double calcularSueldo() {

        double pagoDia = sueldoMensual / 30;

        return sueldoMensual - (pagoDia * diasNoAsistidos);
    }

    public double pagoPorDia() {

        return sueldoMensual / 30;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("EMPLEADO");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellidoPaterno());
        System.out.println("Área: " + getArea().getNombre());
        System.out.println("Sueldo Final: " + calcularSueldo());
    }
}
