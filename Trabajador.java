public abstract class Trabajador {

    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private String telefono;
    private String fechaIngreso;
    private String regimenPensionario;

    private Area area;

    public Trabajador(String tipoDocumento, String numeroDocumento,
            String nombre, String apellidoPaterno,
            String apellidoMaterno, String direccion,
            String telefono, String fechaIngreso,
            String regimenPensionario, Area area) {

        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;

        setRegimenPensionario(regimenPensionario);

        this.area = area;
    }

    // GETTERS Y SETTERS

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {

        if (tipoDocumento.equals("DNI")
                || tipoDocumento.equals("CE")) {

            this.tipoDocumento = tipoDocumento;
        }
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {

        if (numeroDocumento.length() == 8) {
            this.numeroDocumento = numeroDocumento;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {

        if (apellidoPaterno.length() > 0) {
            this.apellidoPaterno = apellidoPaterno;
        }
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {

        if (apellidoMaterno.length() > 0) {
            this.apellidoMaterno = apellidoMaterno;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {

        if (direccion.length() > 0) {
            this.direccion = direccion;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {

        if (telefono.length() == 9) {
            this.telefono = telefono;
        }
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getRegimenPensionario() {
        return regimenPensionario;
    }

    public void setRegimenPensionario(String regimenPensionario) {

        if (regimenPensionario.equals("ONP")
                || regimenPensionario.equals("Prima")
                || regimenPensionario.equals("Habitat")
                || regimenPensionario.equals("Integra")) {

            this.regimenPensionario = regimenPensionario;
        }
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    // MÉTODOS ABSTRACTOS

    public abstract void mostrarDatos();

    public abstract double calcularSueldo();

}
