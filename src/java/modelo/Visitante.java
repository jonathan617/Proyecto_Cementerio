
package modelo;


public class Visitante {
    
    private Integer Codigo_Visitante;
    private Integer Codigo_Usuario;
    private String Nombre_Visitante;
    private String Direccion_Visitante;
    private String Telefono_Visitante;
    private String Email_Visitante;

    public Visitante() {
    }

    public Visitante(Integer Codigo_Visitante, Integer Codigo_Usuario, String Nombre_Visitante, String Direccion_Visitante, String Telefono_Visitante, String Email_Visitante) {
        this.Codigo_Visitante = Codigo_Visitante;
        this.Codigo_Usuario = Codigo_Usuario;
        this.Nombre_Visitante = Nombre_Visitante;
        this.Direccion_Visitante = Direccion_Visitante;
        this.Telefono_Visitante = Telefono_Visitante;
        this.Email_Visitante = Email_Visitante;
    }

    public Integer getCodigo_Visitante() {
        return Codigo_Visitante;
    }

    public void setCodigo_Visitante(Integer Codigo_Visitante) {
        this.Codigo_Visitante = Codigo_Visitante;
    }

    public Integer getCodigo_Usuario() {
        return Codigo_Usuario;
    }

    public void setCodigo_Usuario(Integer Codigo_Usuario) {
        this.Codigo_Usuario = Codigo_Usuario;
    }

    public String getNombre_Visitante() {
        return Nombre_Visitante;
    }

    public void setNombre_Visitante(String Nombre_Visitante) {
        this.Nombre_Visitante = Nombre_Visitante;
    }

    public String getDireccion_Visitante() {
        return Direccion_Visitante;
    }

    public void setDireccion_Visitante(String Direccion_Visitante) {
        this.Direccion_Visitante = Direccion_Visitante;
    }

    public String getTelefono_Visitante() {
        return Telefono_Visitante;
    }

    public void setTelefono_Visitante(String Telefono_Visitante) {
        this.Telefono_Visitante = Telefono_Visitante;
    }

    public String getEmail_Visitante() {
        return Email_Visitante;
    }

    public void setEmail_Visitante(String Email_Visitante) {
        this.Email_Visitante = Email_Visitante;
    }
    
    
    
}