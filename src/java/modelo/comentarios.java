
package modelo;

public class comentarios {
    
    private int codigo;
    private int codigovisita;
    private String fecha;
    private String descripcion;

    public comentarios() {
    }

    public comentarios(int codigo, int codigovisita, String fecha, String descripcion) {
        this.codigo = codigo;
        this.codigovisita = codigovisita;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigovisita() {
        return codigovisita;
    }

    public void setCodigovisita(int codigovisita) {
        this.codigovisita = codigovisita;
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
