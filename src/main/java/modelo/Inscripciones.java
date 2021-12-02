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
        this.estudiantes= new ArrayList<Estudiante>();
    }
    
    
    public void agregarInscripcion(String cedula,String nombre, String materia,String codMateria){
        if(!estudianteExiste(cedula))
        {
            agregarEstudiante(cedula, nombre);
        }
        
        estudiantes.forEach((e) -> {
            if (e.getCedula().equals(cedula)){
                e.agregarMateria(codMateria, materia);
            }
        });
    }
    
    public boolean estudianteExiste(String cedula){
        boolean retorno=false;
        for(int i=0; i<estudiantes.size(); i++)
         {
            if (estudiantes.get(i).getCedula().equals(cedula)){
                retorno= true;
            }
        }
        return retorno;    
    }
    
    public String listarEstudiantesMaterias(){
         String retorno= "Estudiantes- cantidad materias matriculadas";
         for(int i=0; i<estudiantes.size(); i++)
         {
             retorno= retorno+"\n"+(estudiantes.get(i).getNombre()+" "+estudiantes.get(i).getCantidadMaterias());
         }
        return retorno;
    }
    
    public void agregarEstudiante(String cedula, String nombre)
    {
        estudiantes.add(new Estudiante(cedula, nombre));
    }
}
