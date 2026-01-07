public class ServicioMedico {
    private String nombre;
    private String descripcion;
    private Costo costo;
    private int duracion;

    public ServicioMedico(String nombre, String descripcion, Costo costo, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        // Ojo que las dos asignaciones de abajo deben de tener logica de validacion en el setter, esos valores no pueden ser negativos
        this.costo = costo;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Costo getCosto(){
        return costo;
    }

    public void setCosto(Costo costo){
        this.costo = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion<=0) return;
        this.duracion= duracion;
    }
}
