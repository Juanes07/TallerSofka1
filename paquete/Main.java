package paquete;
import java.util.ArrayList;
import java.util.Date;	
import paquete.Person;
import paquete.Fruits;
import paquete.BankAccount;


/**
 *
 * @author JUANES
 */
public class Main {

    public static void main(String[] args) {
        Person p;
        p = new Person();
        p.SetName("Jonathan", "Velasquez", "Posada");
        p.getHeight();
        p.getName();
        
        Fruits f;
        f = new Fruits();
        f.getColor();
        f.setColor("verde","amarillo","rojo");
    }
    
}
