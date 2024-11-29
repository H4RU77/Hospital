/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;
import clases.Usuario;
import okhttp3.*;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 *
 * @author Keloc
 */
public class Auth {
    public static Usuario iniciarSesion(String nombreUsuario, String contrasena) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        
        String json = "{\r\n    \"username\": \"" + nombreUsuario + "\",\r\n    \"password\": \"" + contrasena + "\"\r\n}";
        
        MediaType mediaType = MediaType.parse("application/json");

        RequestBody body = RequestBody.create(mediaType, json);

        Request request = new Request.Builder()
            .url("https://backendhospital-6gpo.onrender.com/usuarios/auth/login")
            .method("POST", body)
            .addHeader("Content-Type", "application/json")
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.code() == 401){
                return null;
            }
            if (!response.isSuccessful()) {
                throw new Exception("Error: " + response.code());
            }
            
            String res = response.body().string();
            Usuario usuario = objectMapper.readValue(res, Usuario.class);
            System.out.println(usuario.getNombreUsuario() + ", "+ usuario.getContrasena() + ", " + usuario.getRol());
            return usuario;
        } 
    }
}
