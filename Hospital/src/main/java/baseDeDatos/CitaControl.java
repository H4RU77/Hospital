/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

import clases.Cita;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
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
public class CitaControl {
    private static final String URL = "https://backendhospital-6gpo.onrender.com/citas";
    
    public static List<Cita> getCitas(){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try {
            Request request = new Request.Builder()
                .url(URL)
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                String resBody = response.body().string();
                List<Cita> citas = objectMapper.readValue(resBody, new TypeReference<List<Cita>>() {});
                return citas;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static List<Cita> getCitaPorPaciente(String nombrePaciente){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try {
            Request request = new Request.Builder()
                .url(URL+"/paciente/"+nombrePaciente)
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                String resBody = response.body().string();
                List<Cita> citas = objectMapper.readValue(resBody, new TypeReference<List<Cita>>() {});
                return citas;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static Cita getCita(Long id){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try {
            Request request = new Request.Builder()
                .url(URL+"/"+id)
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                String resBody = response.body().string();
                Cita cita = objectMapper.readValue(resBody, Cita.class);
                return cita;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static void saveCita(Cita c){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try {
            MediaType mediaType = MediaType.parse("application/json");
            String json = objectMapper.writeValueAsString(c);
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                .url(URL+"/agendar")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()){
                // SI ALGO SALE MAL AQUI PONER ALGO
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void updateCita(Cita c){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try {
            MediaType mediaType = MediaType.parse("application/json");
            String json = objectMapper.writeValueAsString(c);
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                .url(URL+"/actualizar")
                .method("PUT", body)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()){
                // SI ALGO SALE MAL AQUI PONER ALGO
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void deleteCita(Cita c){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try {
            MediaType mediaType = MediaType.parse("application/json");
            String json = objectMapper.writeValueAsString(c);
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                .url(URL+"/eliminar")
                .method("DELETE", body)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()){
                // SI ALGO SALE MAL AQUI PONER ALGO
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
