/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3colecciones;

import alumno.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Ej3Colecciones {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnoLista = new ArrayList();
        Scanner leer = new Scanner(System.in);
        boolean seguir = true;
        Alumno al;
        ArrayList<Integer> notas;
        

        while (seguir)
        {
            notas = new ArrayList();
            System.out.println("INGRESE EL NOMBRE DEL ALUMNO");
            String nombre = leer.next();
            for (int i = 0; i < 3; i++)
            {
                System.out.println("Ingrese la nota n°" + i + 1);
                notas.add(leer.nextInt());
            }
            alumnoLista.add(new Alumno(nombre, notas));
            System.out.println("¿QUIERE CONTINUAR? S/N");
            String preg = leer.next();
            seguir = !"n".equals(preg);
        }
        Iterator<Alumno> it = alumnoLista.iterator();
        System.out.println("Ingese el nombre del alumno que desea calcular el promedio");
        String nombre= leer.next();
       boolean encontro = false;
        while(it.hasNext()){
            Alumno alumno=it.next();
             
            if (alumno.getNombre().equals(nombre))
            {
                System.out.println("El promedio es: "+ alumno.notaFinal());
               encontro=true;
            } 
        }
        
        if (!encontro)
        {
            System.out.println("ALUMNO NO ENCONTRADO");
        }

    }

}
