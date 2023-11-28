/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaPacientes;

import Persona.Paciente;
import Persona.PersonaP;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Student
 */


public class AdministrarPacientes extends Paciente{
private PersonaP numCedula;
private PersonaP nombre;

    public AdministrarPacientes() {
    }

    public AdministrarPacientes(String fecha, String horaLlegada, String horaDeSalida, String clasificacion) {
        super(fecha, horaLlegada, horaDeSalida, clasificacion);
    }

    public AdministrarPacientes(String fecha, String horaLlegada, String horaDeSalida, String clasificacion, String numCedula, String nombre) {
        super(fecha, horaLlegada, horaDeSalida, clasificacion, numCedula, nombre);
    }
   

    public void setNumCedula(PersonaP numCedula) {
        this.numCedula = numCedula;
    }

    public void setNombre(PersonaP nombre) {
        this.nombre = nombre;
    }

    public Stack<String> getLista() {
        return lista;
    }

    public void setLista(Stack<String> lista) {
        this.lista = lista;
    }
    
    
    Stack<String> lista= new Stack<>();
   
    
    
    public String AgregarPaciente(String numCedula){
        
    lista.addElement(numCedula);
    return numCedula;
}
    public String AtentidoPaciente(String horasalida){
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite la hora de salida: ");
        horasalida=sc.nextLine();
    return null;
   
    }
    
    public String mostrarPaciente(String mostrarP){
        for(String mostarP : lista){
            System.out.println("Lista clientes"+ mostrarP);
        }
    return mostrarP;
    }
}


