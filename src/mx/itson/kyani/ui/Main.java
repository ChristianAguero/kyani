/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.kyani.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.kyani.entidades.Alumno;
import mx.itson.kyani.entidades.Grupo;
import mx.itson.kyani.enumeradores.Aprobado;

/**
 *
 * @author shiri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Grupo grupo = new Grupo();
    
        grupo.setNombreMaestro("Christian Agüero Romero");
        grupo.setCiclo("2022-2");
        grupo.setGrupo("Japonés 3");
        grupo.setGrado(3);
        
            List<Alumno> alumnos = new ArrayList<>();
            
            Alumno alumno1 = new Alumno();
            alumno1.setNombre("Edgar Fabian Hernández Valenzuela");
            alumno1.setId(180974);
            alumno1.setCalificacion(10);
            alumno1.setAsistencias(56);
            alumnos.add(alumno1);
            //Hola
            
            Alumno alumno2 = new Alumno();
            alumno2.setNombre("Carlos Alberto Gaxiola Arias     ");
            alumno2.setId(180975);
            alumno2.setCalificacion(10);
            alumno2.setAsistencias(56);
            alumnos.add(alumno2);
            
            Alumno alumno3 = new Alumno();
            alumno3.setNombre("Brandon Campa Valle               ");
            alumno3.setId(180976);
            alumno3.setCalificacion(8);
            alumno3.setAsistencias(50);
            alumnos.add(alumno3);
            
            Alumno alumno4 = new Alumno();
            alumno4.setNombre("Mario Alexis Manrriquez Dueñas    ");
            alumno4.setId(180977);
            alumno4.setCalificacion(9);
            alumno4.setAsistencias(54);
            alumnos.add(alumno4);
            
            Alumno alumno5 = new Alumno();
            alumno5.setNombre("Issac Mauricio Pacheco Garcia    ");
            alumno5.setId(180978);
            alumno5.setCalificacion(10);
            alumno5.setAsistencias(55);
            alumnos.add(alumno5);
            
        grupo.setAlumnos(alumnos);
            
        grupo.setNumeroAlumnos(5);
        
        /*int suma = 0;
        for(Alumno a : grupo.getAlumno()){
            
            suma += a.getCalificacion();
            
        }*/
        
        grupo.setPromedio(9.4);
        
        if(grupo.getPromedio() >= 7){
            
            grupo.setAprobado(Aprobado.APROBADO);
            
        }else{
            
            grupo.setAprobado(Aprobado.REPROBADO);
            
        }
        
        //Imprimir datos
        
        System.out.println("Escuela de Japonés \"Shirigami\"");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Maestro: " + grupo.getNombreMaestro());
        System.out.println("Ciclo escolar: " + grupo.getCiclo() + "       Grupo: " + grupo.getGrupo() + "       Grado: " + grupo.getGrado() + "er semestre" 
            + "        Número de Alumnos: " + grupo.getNumeroAlumnos());
        System.out.println("Nombre                                      Calificacion            ID                 Asistencias");
        
        for(Alumno a : grupo.getAlumnos()){
            
            System.out.println(a.getNombre() + "                     " + a.getCalificacion() + "            " + a.getId()
            + "                      " + a.getAsistencias());
            
        }
        
        System.out.println("");
        System.out.println("                                                                     El promedio grupal es de: " + grupo.getPromedio());
        System.out.println("                                                                           El grupo está: " + grupo.getAprobado());
        
    }
    
}
