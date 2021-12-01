
package modelo;

public class actividad {
    
    private int codigo;
    private int codempleado;
    private String fecha;
    private String descripcion;

    public actividad(int codigo, int codempleado, String fecha, String descripcion) {
        this.codigo = codigo;
        this.codempleado = codempleado;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public actividad() {
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodempleado() {
        return codempleado;
    }

    public void setCodempleado(int codempleado) {
        this.codempleado = codempleado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
