package modelo;

public class Estado {
    private int codestado;
    private int codfallecido;
    private String fecreal;
    private String horreal;
    private String tipo;

    public Estado(int codestado, int codfallecido, String fecreal, String horreal, String tipo) {
        this.codestado = codestado;
        this.codfallecido = codfallecido;
        this.fecreal = fecreal;
        this.horreal = horreal;
        this.tipo = tipo;
    }

    public int getCodestado() {
        return codestado;
    }

    public void setCodestado(int codestado) {
        this.codestado = codestado;
    }

    public int getCodfallecido() {
        return codfallecido;
    }

    public void setCodfallecido(int codfallecido) {
        this.codfallecido = codfallecido;
    }

    public String getFecreal() {
        return fecreal;
    }

    public void setFecreal(String fecreal) {
        this.fecreal = fecreal;
    }

    public String getHorreal() {
        return horreal;
    }

    public void setHorreal(String horreal) {
        this.horreal = horreal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}

