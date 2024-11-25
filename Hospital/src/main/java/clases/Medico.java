/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Keloc
 */
public class Medico extends Usuario{
    
   private String nombre;
    public Medico(String nombreUsuario, String contrasenaUsuario, String nombre) {
        super(nombreUsuario, contrasenaUsuario);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
