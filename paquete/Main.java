package paquete;
import java.util.ArrayList;
import java.util.Set;
import paquete.Person;
import paquete.Fruits;
import paquete.BankAccount;
import paquete.Phone;
import paquete.Computer;
import paquete.Plane;

/**
 *
 * @author JUANES
 */
public class Main {

    public static void main(String[] args) {
        
        /**
         * instanciamos la clase Person con sus metodos.
         */
        
        Person p;
        p = new Person();
        p.getName();
        p.SetName("Jonathan", "Velasquez", "Posada");
        p.getHeight();
        
       
        /**
         * instanciamos la clase Fruits con sus metodos.
         */
       
        Fruits f;
        f = new Fruits();
        f.getColor();
        f.setColor("verde","amarillo","rojo");
        
        /**
         * instanciamos la clase BankAccount con sus metodos.
         */
        
        BankAccount bk;
        bk = new BankAccount();
        bk.setActived();
        bk.getActived();
        
        /**
         * instanciamos la clase Phone con sus metodos.
         */
        
        Phone ph;
        ph = new Phone();
        ph.getNumber();
        ph.setStats(3.5f, 20.5f, "xiaomi");
        
        /**
         * instanciamos la clase Computer con sus metodos.
         */
        
        Computer  cp;
        cp = new Computer();
        cp.setRequire(500, "Nvidia", 2);
        cp.getLoad();
        
        /**
         * instanciamos la clase Plane con sus metodos.
         */
        
        Plane pl;
        pl = new Plane();
        pl.getTankCapacity();
        pl.setArrival("Colombia", 20);
    }
    
}
