
package modelo;

public class tumba {
    
    private int codigo;
    private int codigoemp;
    private String ubicacion;

    public tumba() {
    }

    public tumba(int codigo, int codigoemp, String ubicacion) {
        this.codigo = codigo;
        this.codigoemp = codigoemp;
        this.ubicacion = ubicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoemp() {
        return codigoemp;
    }

    public void setCodigoemp(int codigoemp) {
        this.codigoemp = codigoemp;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}
