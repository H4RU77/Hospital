/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author harum
 */
public class Usuario {
    protected String nombreUsuario;
    protected String contraseñaUsuario;
    
    public Usuario(String nombreUsuario, String contraseñaUsuario){
        this.contraseñaUsuario=contraseñaUsuario;
        this.nombreUsuario=contraseñaUsuario;
    }
    
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public void setNombreUsuario(String nuevoNombre){
        nombreUsuario=nuevoNombre;
    }
     public String getContraseñaUsuario(){
        return contraseñaUsuario;
    }
    public void setContraseñaUsuario(String nuevaContraseña){
        contraseñaUsuario=nuevaContraseña;
    }
    
    public void iniciarSesión(){
        
    }
    
    
    
}
