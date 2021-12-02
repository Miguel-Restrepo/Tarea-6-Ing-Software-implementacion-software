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

    public Estudiante(String celula, String nombre) {
        this.celula = celula;
        this.nombre = nombre;
         this.materiasInscritas= new ArrayList<String>();
    }
    
    public String getCedula(){
        return this.celula;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public int getCantidadMaterias(){
        return this.materiasInscritas.size();
    }
    
    public void agregarMateria(String codMateria, String nombreMateria){
        this.materiasInscritas.add(codMateria+" "+ nombreMateria);
    }
    
}
