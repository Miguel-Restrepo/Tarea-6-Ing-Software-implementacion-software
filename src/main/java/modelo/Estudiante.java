/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Julián Andrés Florez Cendales, Miguel Ángel Restrepo Henao
 */
public class Estudiante {
    private String celula ;
    private String nombre ;
    public ArrayList<String> materiasInscritas;
    
    public int getCantidadMaterias(){
        return this.materiasInscritas.size();
    }
    
    public void agregarMAteria(String codMAteria, String nombreMateria){
        
    }
    
}
