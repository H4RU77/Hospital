/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


/**
 *
 * @author harum
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME, 
    include = JsonTypeInfo.As.PROPERTY, 
    property = "rol",
    visible = true
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Medico.class, name = "MEDICO"),
    @JsonSubTypes.Type(value = Recepcionista.class, name = "RECEPCIONISTA")
})
public class Usuario {
    protected Long id;
    protected String nombreUsuario;
    protected String contrasena;
    protected String rol;
    
    public Usuario(String nombreUsuario, String contraseñaUsuario){
        this.contrasena=contraseñaUsuario;
        this.nombreUsuario=contraseñaUsuario;
    }
    
    public Usuario(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public void setNombreUsuario(String nuevoNombre){
        nombreUsuario=nuevoNombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }    
}
