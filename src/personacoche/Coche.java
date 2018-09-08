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
    float cc;  // cilindrada en decimales 1.6, 1.8, 2.0, 2.2
    boolean diesel; 
    float precio;

    //COSTRUCTORES
    public Coche(String matricula, String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }

    public Coche(String matricula, float cc, float precio){
        this.matricula = matricula;
        this.cc = cc;
        this.precio = precio;
    }
    
   //GETTER

    public String getMatricula() {
        return matricula;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public float getPrecio() {
        return precio;
    }
    
    // SETTER
    public void setMarca(String marca) {  // valores posibles: "Honda", "Ford"
        if(marca.equalsIgnoreCase("Honda") || marca.equalsIgnoreCase("Ford")){
            this.marca = marca;
        }      
    }

    public void setCc(float cc) {  // valores posibles: 1.6, 1.8, 2.0, 2.2
        if(cc == 1.6f || cc == 1.8f || cc == 2.0f || cc == 2.2f){
            this.cc = cc;
        }
    }
    
    
    //Metodo para ver los datos introducidos.
    public String getDetallesCoche(){
        return "\nMarca: " + marca + 
                "\nModelo: " + modelo + 
                "\nMatricula: " + matricula + 
                "\nCaballos de Fuerza cv: " + cv + 
                "\nCilindrada cc: " + cc + 
                "\nEs Diesel: " + diesel + 
                "\nPrecio: " + precio;
    }
        
    
    /*
    
    String marca, modelo, matricula;
    int cv; // caballos de fuerza
    float cc;  // cilindrada en decimales
    boolean diesel; 
    float precio;
    
    
    */
    
    
}

/*
[] Esta clase tendrá como atributos la marca, modelo, cv, cc (cilindrada, debe ser un nº decimal), diesel? (True / false), 
   matrícula y precio.

[] La clase Coche tendrá dos constructores: uno para poder crear coches a partir de la matrícula, marca, modelo y cv y el 
   otro para hacerlo a partir de la matrícula, cc y precio.

[] Ahora generarás algunos getters y setters para las dos clases. Para la clase Coche queremos disponer de getters para los 
   atributos matrícula, diesel? y precio, mientras que para la clase Persona queremos getters para los atributos DNI, altura 
   y coche.

[] Para la clase Coche queremos disponer de setters para los atributos cc (valores posibles: 1.6, 1.8, 2.0, 2.2) y marca 
   (valores posibles: "Honda", "Ford")


*/
