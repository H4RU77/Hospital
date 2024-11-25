/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import okhttp3.*;
import org.json.JSONObject;
import java.util.ArrayList;

/**
 *
 * @author harum
 */



public class GestorUsuarios {
    private static final String URL = "http://localhost:8080/api/usuarios/registro";

    public static void registrarUsuario(String nombreUsuario, String contraseña, String rol, 
                                        String especialidad, String numeroLicencia, String turno) throws Exception {
        OkHttpClient client = new OkHttpClient();

        // Crear el JSON para enviar
        JSONObject json = new JSONObject();
        json.put("nombreUsuario", nombreUsuario);
        json.put("contraseña", contraseña);
        json.put("rol", rol);

        // Agregar datos específicos según el rol
        if ("MEDICO".equals(rol)) {
            json.put("especialidad", especialidad);
            json.put("numeroLicencia", numeroLicencia);
        } else if ("RECEPCIONISTA".equals(rol)) {
            json.put("turno", turno);
        }

        // Crear el cuerpo de la solicitud
        RequestBody body = RequestBody.create(json.toString(), MediaType.get("application/json; charset=utf-8"));

        // Crear la solicitud HTTP
        Request request = new Request.Builder()
                .url(URL)
                .post(body)
                .build();

        // Ejecutar la solicitud
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new Exception("Error en el registro: " + response.message());
            }
        }
    }
}
     
     
     

    

