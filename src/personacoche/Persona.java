/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personacoche;

/**
 *
 * @author YEIALEL
 */
public class Persona {
    String nombre, DNI;
    float altura, peso;
    char sexo; // soolo se puede usar las letras H = hombre y M = mujer 
    Coche cochePersona;

    //CONSTRUCTORES
    public Persona(String nombre, String DNI, char sexo){
        this.nombre = nombre;
        this.DNI = DNI;
        this.sexo = sexo;
    }
    
    public Persona (String DNI, float altura, float peso){
        this.DNI = DNI;
        this.altura = altura;
        this.peso = peso;
    }
    
    public Persona(String DNI, Coche cochePersona){  // Dentro de esto se esta llamando a la clase coche
        this.DNI = DNI;
        this.cochePersona = cochePersona;
    }
    
    
    
}

/*
[] Crea una segunda clase llamada "Persona" con los siguientes atributos: nombre, DNI, altura, peso, sexo (H o M) y el 
   coche de la persona.

[] La clase Persona tendrá tres constructores: uno para poder crear personas a partir del nombre, DNI y sexo, otro para 
   hacerlo a partir del DNI, altura y peso y un último para crearlas a partir del DNI y el su coche.
*/
