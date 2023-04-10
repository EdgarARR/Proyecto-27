/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personapoli;

/**
 *
 * @author Profesor
 */
public class Alumno extends Persona implements Estudiante{
    private String matricula;
    private String carrera;

    public Alumno() {
        super();
    }

    public Alumno(String matricula, String carrera, String nombre, int edad, char sexo, double energia, double experiencia, double conocimiento) {
        super(nombre, edad, sexo, energia, experiencia, conocimiento);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "matricula=" + matricula + ", carrera=" + carrera + '}';
    }

    @Override
    public void correr() {
        this.comer();
        if(this.getEnergia()>5)
            {
                    this.setEnergia(this.getEnergia()-5);
            }
    }

    @Override
    public String comer(){
        
        return "Alumno comiendo atun :'(...";
    }

    @Override
    public void estudiar(double h) {
        this.setConocimiento(this.getConocimiento()+10);
    }
    
    
    
    
    
}
