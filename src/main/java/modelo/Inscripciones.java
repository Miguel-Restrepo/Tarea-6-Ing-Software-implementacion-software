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
public class Inscripciones {
    private ArrayList<Estudiante> estudiantes;

    public Inscripciones() {
    }
    
    
    public void agregarInscripcion(String cedula,String nombre, String materia,String codMAteria){
        if(!estudianteExiste(cedula))
        {
            agregarEstudiante(cedula, nombre);
        }
        
        estudiantes.forEach((e) -> {
            if (e.getCedula().equals(cedula)){
                e.agregarMAteria(codMAteria, materia);
            }
        });
    }
    
    public boolean estudianteExiste(String cedula){
        boolean retorno=false;
        estudiantes.forEach((e) -> {
            if (e.getCedula().equals(cedula)){
                retorno= true;
            }
        });
        return retorno;    
    }
    
    public String[] listarEstudiantesMaterias(){
        String[] retorno = {};
        return retorno;
    }
    
    public void agregarEstudiante(String cedula, String nombre)
    {
        estudiantes.add(new Estudiante(cedula, nombre));
    }
}
