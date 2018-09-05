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
public class Coche {
    
    String marca, modelo, matricula;
    int cv; // caballos de fuerza
    int cc;  // cilindrada en decimales
    boolean diesel; 
    float precio;

    //COSTRUCTORES
    public Coche(String matricula, String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }

    public Coche(String matricula, int cc, float precio){
        this.matricula = matricula;
        this.cc = cc;
        this.precio = precio;
    }
    
    
    
    
    
}

/*
[] Esta clase tendrá como atributos la marca, modelo, cv, cc (cilindrada, debe ser un nº decimal), diesel? (True / false), 
   matrícula y precio.

[] La clase Coche tendrá dos constructores: uno para poder crear coches a partir de la matrícula, marca, modelo y cv y el 
   otro para hacerlo a partir de la matrícula, cc y precio.



*/
