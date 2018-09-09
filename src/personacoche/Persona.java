/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package personacoche;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author YEIALEL
 */
public class Persona {
    String nombre, DNI;
    float peso;
    int altura;  // est valor estara en centimetros.
    char sexo; // solo se puede usar las letras H = hombre y M = mujer 
    Date fNacimiento;
    private Coche cochePersona;  // esto es una variable de tipo clase

    //CONSTRUCTORES
    public Persona(String nombre, int anyo, int mes, int dia){
        this.nombre = nombre;
        GregorianCalendar nacimiento =  new GregorianCalendar(anyo, mes - 1, dia);
        this.fNacimiento = nacimiento.getTime();
    }
    
    public Persona(String nombre, String DNI, char sexo){
        this.nombre = nombre;
        this.DNI = DNI;
        this.sexo = sexo;
    }
    
    public Persona (String DNI, int altura, float peso){
        this.DNI = DNI;
        this.altura = altura;
        this.peso = peso;
    }
    
    public Persona(String DNI, Coche cochePersona){  // Dentro de esto se esta llamando a la clase coche
        this.DNI = DNI;
        this.cochePersona = cochePersona;
    }
    
    //GETTER

    public String getDNI() {
        return DNI;
    }

    public int getAltura() {
        return altura;
    }

    public Coche getCochePersona() {
        return cochePersona;
    }
    
    //SETTER
    public void setPeso(float peso){  // El peso no puede ser negativo
        if(peso >= 0){
            this.peso = peso; 
        }
    }
    
    public void setSexo(char sexo){  // sólo tenemos que aceptar los valores válidos
        this.sexo = sexo;
    }
    
    public void setDni(String DNI){  // comprobar que tenga exactamente 9 caracteres
        int cantidadLetras = DNI.length();  // solo deben de se 9 letras o numeros.
        if(cantidadLetras == 9){
            this.DNI = DNI;
        } 
    }
    
    
    private String DetalleSexo(){  // Con esto solo se podra agregar las letras H o M
        String detalle = "";
        if(sexo == 109 || sexo == 77){
            detalle = "Mujer";
        }
        else if(sexo == 72 || sexo == 104){
            detalle = "Hombre";
        }
        return detalle;
    }
    

    // Metodo que devolvera detalles de la persona y su coche.
    public void getDetallePersona(){
        System.out.println("\nNombre: " + nombre + 
                           "\nDNI: " + DNI + 
                           "\nPeso: " + peso + " kilogramos" +
                           "\nAltura: " + altura + " Centimetros" +  
                           "\nFecha de nacimiento: " + fNacimiento +
                           "\nSexo: " + DetalleSexo() +
                           "\nDetalle de Coche: ");
	if (cochePersona != null)
	{
            System.out.println(cochePersona.getDetallesCoche());
	}
    }
    
    
}

/*
[] Crea una segunda clase llamada "Persona" con los siguientes atributos: nombre, DNI, altura, peso, sexo (H o M) y el 
   coche de la persona.

[] La clase Persona tendrá tres constructores: uno para poder crear personas a partir del nombre, DNI y sexo, otro para 
   hacerlo a partir del DNI, altura y peso y un último para crearlas a partir del DNI y el su coche.

[] Ahora generarás algunos getters y setters para las dos clases. Para la clase Coche queremos disponer de getters para los 
   atributos matrícula, diesel? y precio, mientras que para la clase Persona queremos getters para los atributos DNI, altura 
   y coche.

[] Para la clase Persona queremos setters para los atributos peso (no puede ser negativo), sexo (sólo tenemos que aceptar los 
   valores válidos) y DNI (sabríais comprobar que tenga exactamente 9 caracteres?)

[] [Opcional]: añada un atributo a la clase Persona que sea fecha de nacimiento. Este atributo debe ser de tipo Date, así que 
   tendrá que ver cómo crear fechas en Java!

*/
