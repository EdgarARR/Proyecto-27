/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personapoli;

/**
 *
 * @author Profesor
 */
public class Ayudante extends Alumno implements Trabajador{

    @Override
    public String trabajar(double h) {
        //this.energia=this.energia+5;
        this.setEnergia(this.getEnergia()+5);
        return "Ayudante trabajando....";
    }

    @Override
    public String cobrar() {
        this.comer();
        //this.energia=this.energia+5;this.experiencia= this.experiencia+10;
        this.setEnergia(this.getEnergia()+5);
        this.setExperiencia(this.getExperiencia()+10);
        return "Ayudante cobrando....";
    }

 
    
    
}
