
package modelo;


public class Usuario {
    
    private Integer Codigo_Usuario;
    private String Nombre_Usuario;
    private String Rol_Usuario;
    private String User_Usuario;
    private String Clave_Usuario;

    public Usuario(Integer Codigo_Usuario, String Nombre_Usuario, String Rol_Usuario, String User_Usuario, String Clave_Usuario) {
        this.Codigo_Usuario = Codigo_Usuario;
        this.Nombre_Usuario = Nombre_Usuario;
        this.Rol_Usuario = Rol_Usuario;
        this.User_Usuario = User_Usuario;
        this.Clave_Usuario = Clave_Usuario;
    }

    public Usuario() {
       
    }

    public Integer getCodigo_Usuario() {
        return Codigo_Usuario;
    }

    public void setCodigo_Usuario(Integer Codigo_Usuario) {
        this.Codigo_Usuario = Codigo_Usuario;
    }

    public String getRol_Usuario() {
        return Rol_Usuario;
    }

    public void setRol_Usuario(String Rol_Usuario) {
        this.Rol_Usuario = Rol_Usuario;
    }

    public String getUser_Usuario() {
        return User_Usuario;
    }

    public void setUser_Usuario(String User_Usuario) {
        this.User_Usuario = User_Usuario;
    }

    public String getClave_Usuario() {
        return Clave_Usuario;
    }

    public void setClave_Usuario(String Clave_Usuario) {
        this.Clave_Usuario = Clave_Usuario;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }
    
    
    
}