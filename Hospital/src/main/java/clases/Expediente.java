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
    private Medico medico;
    private Paciente paciente;
    private String historialMedico;

    public Expediente(Medico medico, Paciente paciente, String historialMedico) {
        this.medico = medico;
        this.paciente = paciente;
        this.historialMedico = historialMedico;
    }
    
    public Expediente(){}

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

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }
    
    
}
