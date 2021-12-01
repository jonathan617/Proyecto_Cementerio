
package modelo;


public class Fallecido {
    private int codfallecido;
    private int codtumba;
    private String nomfalle;
    private String fecnaci;
    private String fecmuerte;
    private String fechora;
    private String responsable;
    private String correo;
    private int tel;

    public Fallecido() {
    }

    public Fallecido(int codfallecido, int codtumba, String nomfalle, String fecnaci, String fecmuerte, String fechora, String responsable, String correo, int tel) {
        this.codfallecido = codfallecido;
        this.codtumba = codtumba;
        this.nomfalle = nomfalle;
        this.fecnaci = fecnaci;
        this.fecmuerte = fecmuerte;
        this.fechora = fechora;
        this.responsable = responsable;
        this.correo = correo;
        this.tel = tel;
    }

    public int getCodfallecido() {
        return codfallecido;
    }

    public void setCodfallecido(int codfallecido) {
        this.codfallecido = codfallecido;
    }

    public int getCodtumba() {
        return codtumba;
    }

    public void setCodtumba(int codtumba) {
        this.codtumba = codtumba;
    }

    public String getNomfalle() {
        return nomfalle;
    }

    public void setNomfalle(String nomfalle) {
        this.nomfalle = nomfalle;
    }

    public String getFecnaci() {
        return fecnaci;
    }

    public void setFecnaci(String fecnaci) {
        this.fecnaci = fecnaci;
    }

    public String getFecmuerte() {
        return fecmuerte;
    }

    public void setFecmuerte(String fecmuerte) {
        this.fecmuerte = fecmuerte;
    }

    public String getFechora() {
        return fechora;
    }

    public void setFechora(String fechora) {
        this.fechora = fechora;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
}