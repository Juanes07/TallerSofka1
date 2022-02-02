package paquete;
/**
 *
 * @author JUANES
 */
public class Plane {
    /**
     * variables nativas de clase
     */
    
    protected int numberSeats;
    public float height;
    private int gasolineTank;
    public String arrivalRoute;
    
    /**
     * constructor
     */
   
    public Plane () {
        this.arrivalRoute = "Colombia";
        this.gasolineTank = 100;
        this.height = 45.6f;
        this.numberSeats = 55;
    }
    
    /**
     * Ingresa el lugar de llegada del avion con el numero de asientos ocupados
     * @param arrivalRoute lugar de llegada del avion
     * @param numberSeats numero de asientos ocupados
     */
    
    public void setArrival(String arrivalRoute, int numberSeats){
        
        System.out.println("El vuelo termina en: " + arrivalRoute + " Pero llega con: " + numberSeats +" Puestos ocupados");
        this.arrivalRoute = arrivalRoute;
        this.numberSeats = numberSeats;
    }
    
    /**
     * Validar capacidad total del tanque de gasolina en un avion
     * @return el valor asignado en gasolineTanks
     */
    
    public int getTankCapacity(){
        System.out.println("El tanque tiene : " + gasolineTank + " Litros de gasolina  como capacidad total");
        return gasolineTank;
    }
}
