/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Keloc
 */
public class Emergencia {
    private Long id;
    private String consultorio;
    private int edad;
    private boolean estadoCritico;
    private String nombrePaciente;
    private String razonIngreso;

    public Emergencia(String consultorio, int edad, boolean estadoCritico, String nombrePaciente, String razonIngreso) {
        this.consultorio = consultorio;
        this.edad = edad;
        this.estadoCritico = estadoCritico;
        this.nombrePaciente = nombrePaciente;
        this.razonIngreso = razonIngreso;
    }
    
    public Emergencia(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstadoCritico() {
        return estadoCritico;
    }

    public void setEstadoCritico(boolean estadoCritico) {
        this.estadoCritico = estadoCritico;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getRazonIngreso() {
        return razonIngreso;
    }

    public void setRazonIngreso(String razonIngreso) {
        this.razonIngreso = razonIngreso;
    }
}
