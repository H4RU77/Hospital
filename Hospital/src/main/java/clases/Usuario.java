/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author harum
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Usuario {
    
    protected String nombreUsuario;
    protected String contrasena;
    protected String rol;
    
    public Usuario(String nombreUsuario, String contraseñaUsuario){
        this.contrasena=contraseñaUsuario;
        this.nombreUsuario=contraseñaUsuario;
    }
    
    public Usuario(){}
    
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public void setNombreUsuario(String nuevoNombre){
        nombreUsuario=nuevoNombre;
    }
     public String getContraseñaUsuario(){
        return contrasena;
    }
    public void setContraseñaUsuario(String nuevaContraseña){
        contrasena=nuevaContraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    public void iniciarSesión(){
        
    }
    
    
    
}
