package paquete;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * se hacen import de librerias para uso de arrays
 * /

/**
 *
 * @author JUANES
 */
public class Fruits {
    /**
     * variables nativas de clase
     */
    public String name;
    private Float averageWeight;
    
    public String color;
    
    //constructor 
    public Fruits () {
    
    this.name = "Uvas";
    this.averageWeight = 200F;
    }
    
    //metodos
   
    /**
     * Refleja el peso promedio en una uva
     * @return la variable  averageWeight con su valor asignado en el constructor
     */
    private float getAverageWeight(){
        System.out.println("el peso promedio de una sola uva es de :" + averageWeight + " gramos");
        return this.averageWeight;
    }
    
    /**
     * Posibles colores de las uvas
     * @param color1 Color posible de la fruta uva
     * @param color2 Color posible de la fruta uva
     * @param color3 Color posible de la fruta uva
     */
    public void setColor(String color1, String color2, String color3){
        this.color = color1;
        this.color = color2;
        this.color = color3;
        System.out.println("las uvas pueden ser de estos colores: " + color1 +" " + color2 + " " + color3);
    }
            
    
    /**
     *
     * @return el arreglo colors.
     */ 
    public static String[] getColor() {
       String[] colors  = {"Roja", "Verde", "Morada"};
       System.out.println("Colores generales de las uvas: " + Arrays.toString(colors));
       return colors;
    }
}
    
   
