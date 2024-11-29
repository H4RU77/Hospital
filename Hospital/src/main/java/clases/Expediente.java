/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Keloc
 */
public class Expediente {
    private Long id;
    private Medico medico;
    private Paciente paciente;
    private String historial_clinico;

    public Expediente(Medico medico, Paciente paciente, String historial_clinico) {
        this.medico = medico;
        this.paciente = paciente;
        this.historial_clinico = historial_clinico;
    }
    
    public Expediente(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getHistorial_clinico() {
        return historial_clinico;
    }

    public void setHistorial_clinico(String historialMedico) {
        this.historial_clinico = historialMedico;
    }
    
    
}
