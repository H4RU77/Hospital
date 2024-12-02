/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;
import clases.Medico;
import clases.Usuario;
import com.fasterxml.jackson.core.type.TypeReference;
import okhttp3.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Keloc
 */
public class Auth {
    private final static String URL = "https://backendhospital-6gpo.onrender.com/usuarios";
    
    public static Usuario iniciarSesion(String nombreUsuario, String contrasena) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        
        String json = "{\r\n    \"username\": \"" + nombreUsuario + "\",\r\n    \"password\": \"" + contrasena + "\"\r\n}";
        
        MediaType mediaType = MediaType.parse("application/json");

        RequestBody body = RequestBody.create(mediaType, json);

        Request request = new Request.Builder()
            .url(URL+"/auth/login")
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
    
    public static List<Medico> getMedicos(){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();

        Request request = new Request.Builder()
            .url(URL+"/medicos")
            .method("GET", null)
            .addHeader("Content-Type", "application/json")
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.code() == 401){
                return null;
            }
            if (!response.isSuccessful()) {
                throw new Exception("Error: " + response.message());
            }
            
            String res = response.body().string();
            List<Medico> meds = objectMapper.readValue(res, new TypeReference<List<Medico>>() {});
            return meds;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
        return null;
    }
}
