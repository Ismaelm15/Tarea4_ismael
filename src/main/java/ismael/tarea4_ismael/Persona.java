/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.tarea4_ismael;

/**
 *
 * @author ismae
 */
public class Persona {
    int edad;
    String colorPiel;
    double altura;

    public Persona() {
    }

    public Persona(int edad, String colorPiel, double altura) {
        this.edad = edad;
        this.colorPiel = colorPiel;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public double getAltura() {
        return altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", colorPiel=" + colorPiel + ", altura=" + altura + '}';
    }
    
}
