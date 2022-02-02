package paquete;
/**
 *
 * @author JUANES
 */
public class Person {
    /**
     * variables nativas de clase
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public String dateBirth;
    public Float height;
   
    //constructor
    public Person () {
        this.name = "Juan Esteban";
        this.lastName1 = "Velasquez";
        this.lastName2 = "Posada";
        this.height = 1.65f;
        this.dateBirth = "07/11/1995";
    }  
    
    // metodos 
    
    /**
     *  ingresa el nombre que desea
     * @param name Nombre de la Persona
     * @param lastName1 Primer apellido  de la persona
     * @param lastName2 Segundo apellido  de la persona
     */
    public void SetName (String name,String lastName1, String lastName2){
    
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        System.out.println("Este es mi nombre por medio de un Set: " + name + " " + lastName1 + " " + lastName2);
    }
    
    /**
     * Refleja el peso asignado
     * @return El height asignado en el constructor
     */
    public float getHeight(){   
        System.out.println("Mi peso es: " + height + " kg");
        return this.height;
    }
    
    /**
     * Refleja el nombre asignado
     * @return El name asignado en el constructor
     */
    public  String getName () {
        System.out.println("Este es mi nombre original: " + name);
        return name;
    }
    
    
      
}
