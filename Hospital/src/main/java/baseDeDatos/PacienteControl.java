/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

import clases.Paciente;
import clases.Registro;
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
public class PacienteControl {
    private static final String URL = "https://backendhospital-6gpo.onrender.com/pacientes";
    
    public static List<Paciente> getPacientes(){
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
                List<Paciente> pacs = objectMapper.readValue(resBody, new TypeReference<List<Paciente>>() {});
                return pacs;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static Paciente getPacienteNom(String nomPac){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            Request request = new Request.Builder()
                .url(URL+"/"+nomPac)
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                String resBody = response.body().string();
                Paciente pac = objectMapper.readValue(resBody, Paciente.class);
                return pac;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static Paciente getPacienteById(Long idPaciente){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            Request request = new Request.Builder()
                .url(URL+"/id/"+idPaciente)
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                String resBody = response.body().string();
                Paciente pac = objectMapper.readValue(resBody, Paciente.class);
                return pac;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static void savePaciente(Paciente p){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            MediaType mediaType = MediaType.parse("application/json");
            String json = objectMapper.writeValueAsString(p);
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                .url(URL+"/registro")
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
    
    public static Registro saveRegistro(Registro reg){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try {
            MediaType mediaType = MediaType.parse("application/json");
            String json = objectMapper.writeValueAsString(reg);
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                .url(URL+"/visitas/registrar")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                String resBody = response.body().string();
                Registro r = objectMapper.readValue(resBody, Registro.class);
                return r;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static void updatePaciente(Paciente p){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            MediaType mediaType = MediaType.parse("application/json");
            String json = objectMapper.writeValueAsString(p);
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
    
    public static void deletePaciente(Paciente p){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            MediaType mediaType = MediaType.parse("application/json");
            String json = objectMapper.writeValueAsString(p);
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
    
    public static List<Registro> getRegistros(Long idPac){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try {

            Request request = new Request.Builder()
                .url(URL+"/visitas/"+idPac)
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
            
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()){
                String resBody = response.body().string();
                List<Registro> pacs = objectMapper.readValue(resBody, new TypeReference<List<Registro>>() {});
                return pacs;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
}
