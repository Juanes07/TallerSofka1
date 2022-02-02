package paquete;

/**
 *
 * @author JUANES
 */
public class Computer {
    /**
     * variables nativas de clase
     */
    public double storageBase;
    private int on;
    public String gpu;
    protected int countMonitor;
    
    
    
    /**
     * constructor
     */
    
    public Computer () {
        this.storageBase = 500;
        this.on = 10;
        this.gpu = "Nvidia";
        this.countMonitor = 2;
          
    }
    /**
     * Asignamos  los valores de storage, nombre de gpu y cantidad de monitores deseados
     * @param storageBase Capacidad total de un almacenamiento en Gb
     * @param gpu Nombre de la gpu 
     * @param countMonitor Cantidad de monitores
     */
    
      public void setRequire(double storageBase, String gpu, int countMonitor ){
          this.storageBase = storageBase;
          this.gpu = gpu;
          this.countMonitor = countMonitor;
          
         System.out.println("Quisiera un pc con un almacenamiento de: " + storageBase + "Gb" +" una gpu " + gpu + " y con " + countMonitor + " monitores" );
    }
      
    /**
     * Reflejamos los valores asignados en on dando el tiempo en espera de encendido del pc. tiempo el cual esta en segundo. 
     * @return un entero asignado en el constructor
     */
      public int getLoad(){
          System.out.println("Mi Pc se demora: " + on + " segundos en encender completamente");
          return on;
      } 
}
