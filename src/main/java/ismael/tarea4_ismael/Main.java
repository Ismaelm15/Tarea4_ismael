/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.tarea4_ismael;

/**
 *
 * @author Pablo Mingolla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona a = new Persona();
        Persona b = new Persona(25, "blanco", 2.15);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        
    }
    
}
