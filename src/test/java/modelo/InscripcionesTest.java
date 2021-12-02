/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Julián Andrés Florez Cendales, Miguel Ángel Restrepo Henao
 */
public class InscripcionesTest {
    
    /**
     * Test of agregarInscripcion method, of class Inscripciones.
     */
    @Test
    public void testAgregarInscripcion() {
        System.out.println("agregarInscripcion");
        int viejo=0;
        int nuevo=0;
        String cedula = "123";
        String nombre = "jaime";
        String materia = "fisica";
        String codMateria = "9898";
        Inscripciones instance = new Inscripciones();
         instance.agregarInscripcion(cedula, nombre, materia, codMateria);
        for(int i=0; i<instance.estudiantes.size(); i++)
         {
            if (instance.estudiantes.get(i).getCedula().equals(cedula)){
                viejo=instance.estudiantes.get(i).getCantidadMaterias();
            }
        }
        String materia2 = "matematicas especiales";
        String codMateria2 = "1578";
        instance.agregarInscripcion(cedula, nombre, materia2, codMateria2);
        for(int i=0; i<instance.estudiantes.size(); i++)
         {
            if (instance.estudiantes.get(i).getCedula().equals(cedula)){
                nuevo=instance.estudiantes.get(i).getCantidadMaterias();
            }
        }
        assertEquals(viejo+1, nuevo, 0);
    }
    
    
 /**
     * Test of agregarInscripcion method, of class Inscripciones.
     */
    @Test
    public void testAgregarInscripcionEstudianteNoExiste() {
        System.out.println("agregarInscripcion");
        int viejo=0;
        int nuevo=0;
        String cedula = "123";
        String nombre = "jaime";
        String materia = "fisica";
        String codMateria = "9898";
        Inscripciones instance = new Inscripciones();
        for(int i=0; i<instance.estudiantes.size(); i++)
         {
            if (instance.estudiantes.get(i).getCedula().equals(cedula)){
                viejo=instance.estudiantes.get(i).getCantidadMaterias();
            }
        }
        instance.agregarInscripcion(cedula, nombre, materia, codMateria);
        for(int i=0; i<instance.estudiantes.size(); i++)
         {
            if (instance.estudiantes.get(i).getCedula().equals(cedula)){
                nuevo=instance.estudiantes.get(i).getCantidadMaterias();
            }
        }
        assertEquals(viejo+1, nuevo, 0);
    }

    @org.junit.Test
    public void testEstudianteExiste() {
    }

    @org.junit.Test
    public void testListarEstudiantesMaterias() {
    }

    @org.junit.Test
    public void testAgregarEstudiante() {
    }
 

    
}
