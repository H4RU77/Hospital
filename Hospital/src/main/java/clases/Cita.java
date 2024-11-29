/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDateTime;

/**
 *
 * @author Keloc
 */
public class Cita {
    private Long id;
    private int edad;
    private String telefono;
    private LocalDateTime fecha;
    private String consultorio;
    private String nombreMedico;
    private String nombrePaciente;

    public Cita(int edad, String telefono, LocalDateTime fecha, String consultorio, String nombreMedico, String nombrePaciente) {
        this.edad = edad;
        this.telefono = telefono;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
    }
    
    public Cita(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
    
}
