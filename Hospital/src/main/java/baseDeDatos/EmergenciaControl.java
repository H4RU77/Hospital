/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

import clases.Emergencia;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import javax.swing.JOptionPane;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author Keloc
 */
public class EmergenciaControl {
    private static final String URL = "https://backendhospital-6gpo.onrender.com/emergencias";
    
    public static List<Emergencia> getEmergencias(){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            Request request = new Request.Builder()
                .url(URL)
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                String resBody = response.body().string();
                List<Emergencia> ems = objectMapper.readValue(resBody, new TypeReference<List<Emergencia>>() {});
                return ems;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static List<Emergencia> getEmergenciasPac(String nomPac){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            Request request = new Request.Builder()
                .url(URL+"/paciente/"+nomPac)
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                String resBody = response.body().string();
                List<Emergencia> ems = objectMapper.readValue(resBody, new TypeReference<List<Emergencia>>() {});
                return ems;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static Emergencia getEmergencia(Long id){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            Request request = new Request.Builder()
                .url(URL+"/"+id)
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                String resBody = response.body().string();
                Emergencia em = objectMapper.readValue(resBody, Emergencia.class);
                return em;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static void saveEmergencia(Emergencia em){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            MediaType mediaType = MediaType.parse("application/json");
            String json = objectMapper.writeValueAsString(em);
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                .url(URL+"/registrar")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                // NO SE
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void updateEmergencia(Emergencia em){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            MediaType mediaType = MediaType.parse("application/json");
            String json = objectMapper.writeValueAsString(em);
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                .url(URL+"/actualizar")
                .method("PUT", body)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                // NO SE
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void deleteEmergencia(Emergencia em){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            MediaType mediaType = MediaType.parse("application/json");
            String json = objectMapper.writeValueAsString(em);
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                .url(URL+"/eliminar")
                .method("DELETE", body)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                // NO SE
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
