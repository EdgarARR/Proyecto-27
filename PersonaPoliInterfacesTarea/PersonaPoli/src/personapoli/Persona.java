/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personapoli;

/**
 *
 * @author Profesor
 */
public abstract class Persona {
        private String nombre;
        private int edad;
        private char sexo;
        private double energia;
        private double experiencia;
        private double conocimiento;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double energia, double experiencia, double conocimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.energia = energia;
        this.experiencia = experiencia;
        this.conocimiento = conocimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public double getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(double conocimiento) {
        this.conocimiento = conocimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", energia=" + energia + ", experiencia=" + experiencia + ", conocimiento=" + conocimiento + '}';
    }
        
    
        
    abstract public void correr();
    
    public String comer(){
        return "Persona comiendo...";
    }
    
}
