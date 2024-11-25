/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Keloc
 */
public class Registro {
    private Paciente Paciente;
    private String motivoVisita;

    public Registro(Paciente Paciente, String motivoVisita) {
        this.Paciente = Paciente;
        this.motivoVisita = motivoVisita;
    }
    
    public Registro(){}

    public Paciente getPaciente() {
        return Paciente;
    }

    public void setPaciente(Paciente Paciente) {
        this.Paciente = Paciente;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }
}
