package paquete;
import java.util.ArrayList;
import java.util.Arrays;
// se hacen import de librerias para uso de arrays
/**
 *
 * @author JUANES
 */
public class Fruits {
    public String name;
    
    private Float averageWeight;
    public String[] colors  = {"Roja", "Verde", "Morada"};
    public String color;
    
    
    //constructor 
    public Fruits () {
    
    this.name = "Uvas";
    this.averageWeight = 200F;    
    }
    
    //metodos
    
    private float getAverageWeight(){
        System.out.println("el peso promedio de una sola uva es de :" + averageWeight + "gramos");
        return this.averageWeight;
    }
    
    //se pueden color los colores que deseen dentro de los paremetros de setColor
    public void setColor(String color1, String color2, String color3){
        this.color = color1;
        this.color = color2;
        this.color = color3;
        System.out.println("las uvas pueden ser de estos colores: " + color1 +" " + color2 + " " + color3);
    }
            
    
    
    public String getColor() {
     System.out.println("Las uvas pueden ser del color: " + Arrays.toString(colors));
     // si cambiamos el valor dentro las llaves, nos regresa el color correspondiente a la posicion dentro del array
     return this.colors[0];
    }
}
    
   
