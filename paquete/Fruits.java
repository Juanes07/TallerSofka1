package paquete;

/**
 *
 * @author JUANES
 */
public class Fruits {
    String name;
    Float averageWeight;
    String[] colors  = {"Roja", "Verde", "Morada"};
    
    
    //constructor 
    public Fruits () {
    
    name = "Uvas";
    averageWeight = 200F;    
    }
    
    //metodos
    
    public float getAverageWeight(){
        System.out.println("el peso promedio de una sola uva es de :" + averageWeight + "gramos");
        return this.averageWeight;
    }
    public String setColor(){
    
        this.colors = colors[1];
    }
    
    public String getColor() {
     System.out.println("Las uvas pueden ser del color: " + colors);
     // si cambiamos el valor dentro las llaves, nos regresa el color correspondiente a la posicion dentro del array
     return this.colors[0];
    }
    
    
    
    
    
    
    
}
