/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author Student
 */
public class PersonaP {
    private String numCedula;
    private String nombre;

    public PersonaP() {
    }

    public PersonaP(String numCedula, String nombre) {
        this.numCedula = numCedula;
        this.nombre = nombre;
    }
    
    

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
