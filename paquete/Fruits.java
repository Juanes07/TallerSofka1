package paquete;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author JUANES
 */
public class Fruits {
    String name;
    Float averageWeight;
    String[] colors  = {"Roja", "Verde", "Morada"};
    String color;
    
    
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
    
   
