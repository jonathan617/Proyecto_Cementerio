
package modelo;

public class PQRS {
    
    private int codigo;
    private int codigovis;
    private String fecha;
    private String descripcion;

    public PQRS() {
    }

    public PQRS(int codigo, int codigovis, String fecha, String descripcion) {
        this.codigo = codigo;
        this.codigovis = codigovis;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigovis() {
        return codigovis;
    }

    public void setCodigovis(int codigovis) {
        this.codigovis = codigovis;
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
