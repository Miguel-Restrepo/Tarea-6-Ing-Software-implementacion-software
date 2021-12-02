/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Inscripciones;

/**
 *
 * @author Julián Andrés Florez Cendales, Miguel Ángel Restrepo Henao
 */
public class ArchivoPlano {
    private ArrayList<String> datos;
    public String ruta;
    private Inscripciones inscripcion;
    /**
     * contructor de la clase archivo, la cual funciona apartir de la ruta del mismo
     * @param ruta 
     */
    public ArchivoPlano(String ruta) {
        this.ruta=ruta;
        this.inscripcion= new Inscripciones();
    }
    /**
     * lee el archivo haciendo uso de la libreria BufferedReader apartir de la ruta, me retorna el todo en un String
     * @param ruta
     * @return 
     */
    public void convertirPlano( String ruta){
        String Texto="";
         try(BufferedReader br = new BufferedReader(new FileReader(ruta))) 
        {
            String line;
            Texto=br.readLine();
            while ((line = br.readLine()) != null) {
                datos.add(line);
                String[] temp= line.split(",");
                agregarInscripcion(temp[0], temp[1], temp[3], temp[2]);
            }
        }
        catch (IOException e) {
            System.out.println("ha ocurrido un error.");
            JOptionPane.showMessageDialog(null, "Archivo"+ruta+" no encontrado");
            e.printStackTrace();
        }
    }
    
    public void agregarInscripcion(String cedula,String nombre, String materia,String codMateria){
        
        this.inscripcion.agregarInscripcion( cedula,nombre, materia,codMateria);
    }
    
    public void cargarPlano(){
        convertirPlano(this.ruta);
    }
    
    public void imprimirMensaje( String mensaje){
        
    }
}
