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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Persona p1 = new Persona("tomas estrada", "43588075Q", 'M');
        
        Coche c1 = new Coche("12345ABC", "Toyota", "vuela", 1200);
    }
    
}

/* 
En esta actividad vamos un poquito más allá y dispondremos de dos clases, Persona y Coche, con la particularidad de 
que una persona podrá tener un coche, además del resto de sus atributos.
El pequeño proyecto está desglosado en diferentes tareas para que usted pueda ir construyendo progresivamente. Se 
recomienda probar cada funcionalidad tras completarla y no esperar al final para probarlo todo.

Hoja de ruta
[x] Crea un nuevo proyecto Java con una clase llamada "Coche", además de la clase que se te generará automáticamente.

[x] Esta clase tendrá como atributos la marca, modelo, cv, cc (cilindrada, debe ser un nº decimal), diesel? (True / false), 
   matrícula y precio.

[x] Crea una segunda clase llamada "Persona" con los siguientes atributos: nombre, DNI, altura, peso, sexo (H o D) y el 
   coche de la persona.

[x] La clase Coche tendrá dos constructores: uno para poder crear coches a partir de lamatrícula, marca, modelo y cv y el 
   otro para hacerlo a partir de la matrícula, cc y precio.

[x] La clase Persona tendrá tres constructores: uno para poder crear personas a partir del nombre, DNI y sexo, otro para 
   hacerlo a partir del DNI, altura y peso y un último para crearlas a partir del DNI y el su coche.

[] En main del proyecto crea Coches y Personas de las diferentes maneras posibles para comprobar el correcto funcionamiento 
   de los constructores.

[] Ahora generarás algunos getters y setters para las dos clases. Para la clase Coche queremos disponer de getters para los 
   atributos matrícula, diesel? y precio, mientras que para la clase Persona queremos getters para los atributos DNI, altura 
   y coche.

[] Para la clase Coche queremos disponer de setters para los atributos cc (valores posibles: 1.6, 1.8, 2.0, 2.2) y marca 
   (valores posibles: "Honda", "Ford"), mientras que para la clase Persona queremos setters para los atributos peso (no 
   puede ser negativo), sexo (sólo tenemos que aceptar los valores válidos) y DNI (sabríais comprobar que tenga exactamente 9 
   caracteres?)

[] Finalmente queremos que cada una de las clases disponga de un método que muestre por pantalla (System.out) los datos del 
   objeto (el valor de sus atributos). Hay que tener en cuenta que cuando se muestren por pantalla los datos de la persona 
   también es necesario mostrar las del coche que tiene!

[] Realiza las comprobaciones necesarias para asegurar el correcto funcionamiento de tu programa.

[] Si no lo has hecho, prueba a mostrar los datos de una persona que tenga coche y de otra que no lo tenga. Encuentras algún 
   problema? En caso afirmativo, intenta pensar como resolverlo.

[] [Opcional]: añada un atributo a la clase Persona que sea fecha de nacimiento. Este atributo debe ser de tipo Date, así que 
   tendrá que ver cómo crear fechas en Java!
*/
