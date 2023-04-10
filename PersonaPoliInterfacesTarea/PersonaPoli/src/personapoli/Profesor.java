/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personapoli;

/**
 *
 * @author Profesor
 */

//Herencia de una clase por extends y multiples coportamientos por el implements
public class Profesor extends Persona implements Trabajador{
    
    private int numEco;
    private int departamento;
    private int categoria;

    public Profesor() {
        //Llamado al constructor por defectode la clase padre
        //new Persona();
        super();
    }

    
    public Profesor(int numEco, int departamento) {
        //Llamado al constructor por defectode la clase padre
        //new Persona();
        super();
        this.numEco = numEco;
        this.departamento = departamento;
    }
    
    public Profesor(int numEco, int departamento, String nombre, int edad, char sexo, double energia, double experiencia, double conocimiento, int categoria) {
        //Llamado al método constructor de la clase persona.
        //Es el método que pide parámetros
        super(nombre, edad, sexo, energia, experiencia, conocimiento);
        this.numEco = numEco;
        this.departamento = departamento;
        this.categoria= categoria;
    }

    public int getNumEco() {
        return numEco;
    }

    public void setNumEco(int numEco) {
        this.numEco = numEco;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getCategoria() {
        return this.categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

        
    @Override
    public String toString() {
        return super.toString() +"Profesor{" + "numEco=" + numEco + ", departamento=" + departamento + ", Categoria=" + categoria + '}';
    }

    @Override
    public void correr() {
        this.comer();
        //Lo de abajo es equivalene a this.energia=this.energia-20;
        //Solo que no se puede hacer la asignación directa por el encapsulamiento
        if(this.getEnergia()>20){
            this.setEnergia(this.getEnergia()-20);
        }
    }

    @Override
    public String trabajar(double h) {
        return "Profesor trabajando...";
    }

    @Override
    public String cobrar() {
        //this.experiencia=this.experiencia+1;
        this.setExperiencia(this.getExperiencia()+1);
        return "Profesor cobrando";
    }

    
}
