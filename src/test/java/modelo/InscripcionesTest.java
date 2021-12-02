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
 * @author migue
 */
public class InscripcionesTest {
    
    public InscripcionesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of agregarInscripcion method, of class Inscripciones.
     */
    @Test
    public void testAgregarInscripcion() {
        System.out.println("agregarInscripcion");
        String cedula = "";
        String nombre = "";
        String materia = "";
        String codMateria = "";
        Inscripciones instance = new Inscripciones();
        instance.agregarInscripcion(cedula, nombre, materia, codMateria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estudianteExiste method, of class Inscripciones.
     */
    @Test
    public void testEstudianteExiste() {
        System.out.println("estudianteExiste");
        String cedula = "";
        Inscripciones instance = new Inscripciones();
        boolean expResult = false;
        boolean result = instance.estudianteExiste(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarEstudiantesMaterias method, of class Inscripciones.
     */
    @Test
    public void testListarEstudiantesMaterias() {
        System.out.println("listarEstudiantesMaterias");
        Inscripciones instance = new Inscripciones();
        String expResult = "";
        String result = instance.listarEstudiantesMaterias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarEstudiante method, of class Inscripciones.
     */
    @Test
    public void testAgregarEstudiante() {
        System.out.println("agregarEstudiante");
        String cedula = "";
        String nombre = "";
        Inscripciones instance = new Inscripciones();
        instance.agregarEstudiante(cedula, nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
