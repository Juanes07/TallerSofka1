package paquete;
/**
 *
 * @author JUANES
 */
public class Person {
    // variables nativas de clase
    String name;
    String lastName1;
    String lastName2;
    String dateBirth;
    Float height;
   
    //constructor
    public Person () {
        this.name = "Juan Esteban";
        this.lastName1 = "Velasquez";
        this.lastName2 = "Posada";
        this.height = 1.65f;
        this.dateBirth = "07/11/1995";
    }  
    
    // metodos 
    // con el metodo Set podemos modificar los valores de la clase persona pero sin alternar valores originales
    public void SetName (String name,String lastName1, String lastName2){
    
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        System.out.println("Este es mi nombre por medio de un Set: " + name + " " + lastName1 + " " + lastName2);
    }
    // con el get obtenemos el valor ya preestablecido en la clase persona
    public float getHeight(){   
        System.out.println("Mi peso es: " + height + " kg");
        return this.height;
    }
    
    public  String getName () {
        System.out.println("Este es mi nombre original: " + name);
        return this.name;
    }
      
}
