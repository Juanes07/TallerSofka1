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
    
      public void setRequire(double storageBase, String gpu, int countMonitor ){
          this.storageBase = storageBase;
          this.gpu = gpu;
          this.countMonitor = countMonitor;
          
         System.out.println("Quisiera un pc con un almacenamiento de: " + storageBase + "Gb" +" una gpu " + gpu + " y con " + countMonitor + " monitores" );
    }
      
      public int getLoad(){
          System.out.println("Mi Pc se demora: " + on + " segundos en encender completamente");
          return on;
      }
    
}
