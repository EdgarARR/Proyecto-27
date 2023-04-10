/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personapoli;

/**
 *
 * @author Profesor
 */
public class PersonaPoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno p1= new Alumno();
        p1.setNombre("Edgar");
        p1.setConocimiento(100.0);
        p1.setEnergia(50.6);
        p1.setSexo('M');
        p1.setExperiencia(79.4);
        p1.setEdad(19);
        p1.setMatricula("2213002096");
        p1.setCarrera("Compu");
        System.out.println(p1);
        p1.correr();
        System.out.println(p1);
    }
    
}
