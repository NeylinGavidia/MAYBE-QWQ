public class Area {

    private String codigo;
    private String nombre;
    private Area areaSuperior;

    public Area(String codigo, String nombre, Area areaSuperior) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaSuperior = areaSuperior;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {

        if (codigo.length() > 0) {
            this.codigo = codigo;
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

    public Area getAreaSuperior() {
        return areaSuperior;
    }

    public void setAreaSuperior(Area areaSuperior) {
        this.areaSuperior = areaSuperior;
    }
}
