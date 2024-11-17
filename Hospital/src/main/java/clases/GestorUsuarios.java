/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author harum
 */
public class GestorUsuarios {
    private ArrayList<Usuario> listaUsuarios;
    
    public GestorUsuarios() {
        listaUsuarios = new ArrayList<>();
    }
    
     public Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }
     
      public void registrarUsuario(String nombreUsuario, String contraseñaUsuario) {
        if (buscarUsuario(nombreUsuario) == null) {
            Usuario nuevoUsuario = new Usuario(nombreUsuario, contraseñaUsuario);
            listaUsuarios.add(nuevoUsuario);
            System.out.println("Usuario registrado con éxito.");
        } else {
            System.out.println("El nombre de usuario ya está registrado.");
        }
    }
      
       public boolean validarUsuario(String nombreUsuario, String contraseñaUsuario) {
        Usuario usuario = buscarUsuario(nombreUsuario);
        if (usuario != null && usuario.getContraseñaUsuario().equals(contraseñaUsuario)) {
            return true;
        }
        return false;
    }
    
    
}
