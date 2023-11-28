/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author Student
 */
public class Paciente extends PersonaP {
    private String fecha;
    private String horaLlegada;
    private String horaDeSalida;
    private String clasificacion;

    public Paciente(String fecha, String horaLlegada, String horaDeSalida, String clasificacion) {
        this.fecha = fecha;
        this.horaLlegada = horaLlegada;
        this.horaDeSalida = horaDeSalida;
        this.clasificacion = clasificacion;
    }

    public Paciente(String fecha, String horaLlegada, String horaDeSalida, String clasificacion, String numCedula, String nombre) {
        super(numCedula, nombre);
        this.fecha = fecha;
        this.horaLlegada = horaLlegada;
        this.horaDeSalida = horaDeSalida;
        this.clasificacion = clasificacion;
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
}
