package paquete;

/**
 *
 * @author JUANES
 */
public class Phone {
    /**
     * variables nativas de clase
     */
    private long number;
    private String manufacturer;
    protected String so;
    public float height;
    public float weight;
    
    
    //constructor
    public Phone (){
        this.number = 300500201;
        this.manufacturer = "Xiaomi";
        this.so = "android";
        this.height = 5.5f;
        this.weight = 30;
    }
    
    /**
     * 
     * @return el numero establecido en el constructor
     */
    public long getNumber(){
        this.number = number;
        System.out.println("El numero de mi telefono es: " + number);
        return number;
    }
    
    /**
     * Especificaciones del telefono
     * @param height altura del telefono
     * @param weight peso del telefono
     * @param manufacturer  Fabricante del telefono
     */
    public void setStats(float height, float weight, String manufacturer){
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
        System.out.println("la Altura de mi telefono es: " + height + " cm " +" Su peso es de: "+ weight + " gramos" + " y es de marca: " + manufacturer);
        
    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
